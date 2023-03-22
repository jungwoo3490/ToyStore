package list;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import guimain.GUIMain;
import list.NewToyListGUI.MyActionListener;
import tabledemo.TableSelectionDemo;
import toystore.FancyToyMgr;
import toystore.NewToyMgr;

public class SellListGUI extends JPanel {
	private GUIMain win;
	static JFrame mainFrame3 = new JFrame("판매/대여리스트");
	TableSelectionDemo itemTable;
	JButton btn;
	public SellListGUI(GUIMain win) {
        this.win = win;
        JTabbedPane jtab = new JTabbedPane();
        mainFrame3.getContentPane().add(jtab);
        itemTable = new TableSelectionDemo();
        itemTable.addComponentsToPane2(FancyToyMgr.getInstance());
        add(itemTable, BorderLayout.CENTER);
        btn = new JButton("뒤로");
        btn.setForeground(new Color(255,255,255));
        btn.setBackground(new Color(255,60,60));
        add(btn, BorderLayout.LINE_END);
        btn.addActionListener(new MyActionListener());
        Font font = new Font("나눔고딕코딩", Font.BOLD, 18);
        btn.setFont(font);
	}
	public void reset(GUIMain win) {
		this.win = win;
		win.jpanel08.removeAll();
		win.jpanel08.repaint();
		remove(win.jpanel08.itemTable);
		remove(win.jpanel08.btn);
        TableSelectionDemo itemTable = new TableSelectionDemo();
        itemTable.addComponentsToPane2(FancyToyMgr.getInstance());
        add(itemTable, BorderLayout.CENTER);
        JButton btn = new JButton("뒤로");
        btn.setForeground(new Color(255,255,255));
        btn.setBackground(new Color(255,60,60));
        add(btn, BorderLayout.LINE_END);
        btn.addActionListener(new MyActionListener());
        Font font = new Font("나눔고딕코딩", Font.BOLD, 18);
        btn.setFont(font);
	}
	 class MyActionListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	win.change("panel03");
	        }
	 }
}
