package list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import guimain.GUIMain;
import list.SellListGUI.MyActionListener;
import tabledemo.TableSelectionDemo;
import toystore.FancyToyMgr;
import toystore.OrderMgr;

public class OrderListGUI extends JPanel {
	private GUIMain win;
	static JFrame mainFrame4 = new JFrame("ÁÖ¹®³»¿ª");
	TableSelectionDemo itemTable;
	JButton btn;
	public OrderListGUI(GUIMain win) {
        this.win = win;
        JTabbedPane jtab = new JTabbedPane();
        mainFrame4.getContentPane().add(jtab);
        itemTable = new TableSelectionDemo();
        itemTable.addComponentsToPane3(OrderMgr.getInstance());
        add(itemTable, BorderLayout.CENTER);
        btn = new JButton("µÚ·Î");
        btn.setForeground(new Color(255,255,255));
        btn.setBackground(new Color(255,60,60));
        add(btn, BorderLayout.LINE_END);
        btn.addActionListener(new MyActionListener());
        Font font = new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18);
        btn.setFont(font);
	}
	public void reset(GUIMain win) {
		this.win = win;
		win.jpanel09.removeAll();
		win.jpanel09.repaint();
		remove(win.jpanel09.itemTable);
		remove(win.jpanel09.btn);
        TableSelectionDemo itemTable = new TableSelectionDemo();
        itemTable.addComponentsToPane3(OrderMgr.getInstance());
        add(itemTable, BorderLayout.CENTER);
        JButton btn = new JButton("µÚ·Î");
        btn.setForeground(new Color(255,255,255));
        btn.setBackground(new Color(255,60,60));
        add(btn, BorderLayout.LINE_END);
        btn.addActionListener(new MyActionListener());
        Font font = new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18);
        btn.setFont(font);
	}
	 class MyActionListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	win.change("panel03");
	        }
	 }
}

