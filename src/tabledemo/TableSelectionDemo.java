package tabledemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import borrow.BorrowDialog;
import buy.BuyDialog;
import buy.BuyNewDialog;
import buy.CompleteBuyDialog;
import cash.CompleteChargeDialog;
import cash.NoCashDialog;
import facade.DataEngineInterface;
import facade.UIData;
import guimain.GUIMain;
import login.CompleteSignInDialog;
import login.FailLoginDialog;
import login.LoginGUI;
import mgr.Manageable;
import report.ReportDialog;
import sell.CompleteSellDialog;
import toystore.FancyToyMgr;
import toystore.Store;
import toystore.FancyToy;
import toystore.NewToyMgr;
import toystore.UserMgr;

public class TableSelectionDemo extends JPanel implements ListSelectionListener {
    private static final long serialVersionUID = 1L;
    DefaultTableModel tableModel;
    DefaultTableModel tableModel2;
    JTable table;
    JTable table2;
    int selectedIndex = -1;
    DataEngineInterface dataMgr;
    public TableSelectionDemo() {
    	super(new BorderLayout());
    }
    public void addComponentsToPane(DataEngineInterface mgr) {
     	init(mgr);
    	JScrollPane center = new JScrollPane(table);   	
    	add(center, BorderLayout.CENTER);
    }
    @SuppressWarnings("serial")
	void init(DataEngineInterface mgr) {
    	dataMgr = mgr;
    	tableModel = new DefaultTableModel(mgr.getColumnNames(), 0){
    		 public boolean isCellEditable(int row, int column){
    			    return false;
    		 }
    	};
    	loadData("");
    	
    	table = new JTable(tableModel);
        ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(this);
        table.setPreferredScrollableViewportSize(new Dimension(500, 220));
        table.setFillsViewportHeight(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    }
    public void loadData(String kwd) {
    	List<?> result = dataMgr.search(kwd);
    	tableModel.setRowCount(0);
    	for (Object m : result)
    		tableModel.addRow(((UIData)m).getUiTexts());
    }
    public void buyNew() {
    	if (selectedIndex < 0)
    		return;
        String[] rowTexts = new String[tableModel.getColumnCount()];
        for (int i = 0; i < rowTexts.length; i++)
        	rowTexts[i] = (String)tableModel.getValueAt(selectedIndex, i);
    	BuyNewDialog dlg = new BuyNewDialog(rowTexts);
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void buyFancy() {
    	if (selectedIndex < 0)
    		return;
        String[] rowTexts = new String[tableModel.getColumnCount()];
        for (int i = 0; i < rowTexts.length; i++)
        	rowTexts[i] = (String)tableModel.getValueAt(selectedIndex, i);
    	BuyDialog dlg = new BuyDialog(rowTexts);
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void borrowFancy() {
    	if (selectedIndex < 0)
    		return;
        String[] rowTexts = new String[tableModel.getColumnCount()];
        for (int i = 0; i < rowTexts.length; i++)
        	rowTexts[i] = (String)tableModel.getValueAt(selectedIndex, i);
    	BorrowDialog dlg = new BorrowDialog(rowTexts);
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void report() {
    	ReportDialog dlg = new ReportDialog();
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void noCash() {
    	NoCashDialog dlg = new NoCashDialog();
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void completeBuy() {
    	CompleteBuyDialog dlg = new CompleteBuyDialog();
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void completeSignIn() {
    	CompleteSignInDialog dlg = new CompleteSignInDialog();
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void completeSell() {
    	CompleteSellDialog dlg = new CompleteSellDialog();
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void completeCharge() {
    	CompleteChargeDialog dlg = new CompleteChargeDialog();
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void failLogin() {
    	FailLoginDialog dlg = new FailLoginDialog();
    	dlg.setup();
    	dlg.pack();
    	dlg.setVisible(true);
    }
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
        if (!lsm.isSelectionEmpty()) {
        	selectedIndex = lsm.getMinSelectionIndex();
        }
    }
    public void addComponentsToPane2(DataEngineInterface mgr) {
     	init2(mgr);
    	JScrollPane center = new JScrollPane(table);   	
    	add(center, BorderLayout.CENTER);
    }
    @SuppressWarnings("serial")
    UserMgr userMgr = UserMgr.getInstance();
	void init2(DataEngineInterface mgr) {
    	dataMgr = mgr;
    	tableModel = new DefaultTableModel(mgr.getColumnNames(), 0){
    		 public boolean isCellEditable(int row, int column){
    			    return false;
    		 }
    	};
    	GUIMain.user = userMgr.getUser(LoginGUI.updateId);
    	loadSellData();
    	table = new JTable(tableModel);
        ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(this);
        table.setPreferredScrollableViewportSize(new Dimension(500, 220));
        table.setFillsViewportHeight(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    }
	void loadSellData() {
    	tableModel.setRowCount(0);
    	for (Manageable m : Store.fancyToyMgr.mList) {
    		if (m.matches(GUIMain.user.userid))
    		tableModel.addRow(((UIData)m).getUiTexts());
    	}
	}
	public void addComponentsToPane3(DataEngineInterface mgr) {
     	init3(mgr);
    	JScrollPane center = new JScrollPane(table);   	
    	add(center, BorderLayout.CENTER);
    }
    @SuppressWarnings("serial")
	void init3(DataEngineInterface mgr) {
    	dataMgr = mgr;
    	tableModel = new DefaultTableModel(mgr.getColumnNames(), 0){
    		 public boolean isCellEditable(int row, int column){
    			    return false;
    		 }
    	};
    	GUIMain.user = userMgr.getUser(LoginGUI.updateId);
    	loadOrderData();
    	table = new JTable(tableModel);
        ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(this);
        table.setPreferredScrollableViewportSize(new Dimension(500, 220));
        table.setFillsViewportHeight(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    }
	void loadOrderData() {
    	tableModel.setRowCount(0);
    	for (Manageable m : Store.orderMgr.mList) {
    		if (m.matches(GUIMain.user.userid))
    		tableModel.addRow(((UIData)m).getUiTexts());
    	}
	}
}

