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
import login.LoginGUI.MyActionListener;
import panel.BottomPanel;
import panel.TopPanel;
import tabledemo.TableSelectionDemo;
import toystore.FancyToyMgr;
import toystore.NewToyMgr;


public class FancyToyListGUI extends JPanel {
	private GUIMain win;
	TableSelectionDemo itemTable;
	JButton btn;
	static JFrame mainFrame2 = new JFrame("TableSelectionDemo");
	public FancyToyListGUI(GUIMain win) {
        this.win = win;
        JTabbedPane jtab = new JTabbedPane();
        jtab.add("신상품 구매", this);
        mainFrame2.getContentPane().add(jtab);
        itemTable = new TableSelectionDemo();
        itemTable.addComponentsToPane(FancyToyMgr.getInstance());
        TopPanel itemTop = new TopPanel();
        itemTop.setupTopPane(itemTable);
        BottomPanel itemBottom = new BottomPanel();
        itemBottom.setupBottomPane(itemTable);
        add(itemTop, BorderLayout.NORTH);
        add(itemTable, BorderLayout.CENTER);
        add(itemBottom, BorderLayout.SOUTH);
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
		win.jpanel06.removeAll();
		win.jpanel06.repaint();
		remove(win.jpanel06.itemTable);
		remove(win.jpanel06.btn);
        TableSelectionDemo itemTable = new TableSelectionDemo();
        itemTable.addComponentsToPane(FancyToyMgr.getInstance());
        TopPanel itemTop = new TopPanel();
        itemTop.setupTopPane(itemTable);
        BottomPanel itemBottom = new BottomPanel();
        itemBottom.setupBottomPane(itemTable);
        add(itemTop, BorderLayout.NORTH);
        add(itemTable, BorderLayout.CENTER);
        add(itemBottom, BorderLayout.SOUTH);
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
