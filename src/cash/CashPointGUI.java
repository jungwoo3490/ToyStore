package cash;

import javax.swing.*;

import guimain.GUIMain;
import tabledemo.TableSelectionDemo;
import toystore.User;
import toystore.UserMgr;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
public class CashPointGUI extends JPanel{     
	static UserMgr userMgr = UserMgr.getInstance();
    private JTextField textField;
    private GUIMain win;
    public CashPointGUI(GUIMain win) {
        setLayout(null);
        this.win = win;
        
        JLabel lblLbl_0 = new JLabel("Toy Story");
        lblLbl_0.setBounds(0, 0, 534, 60);
        lblLbl_0.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_0.setOpaque(true);
        lblLbl_0.setForeground(new Color(60,100,255));
        lblLbl_0.setBackground(new Color(255,255,140));
        add(lblLbl_0);
        
        Font font = new Font("¹ÙÅÁÃ¼", Font.BOLD,30);
        lblLbl_0.setFont(font);
        
        GUIMain.user = userMgr.getUser("jungwoo3490");
        JLabel lblLbl = new JLabel("ÇöÀç ÀÜ¾×: " + GUIMain.user.cashPoint + "point");
        lblLbl.setBounds(167, 150, 200, 30);
        add(lblLbl);
        
        JLabel lblLbl_1 = new JLabel("ÃæÀüÆ÷ÀÎÆ®: ");
        lblLbl_1.setBounds(30, 180, 150, 30);
        lblLbl_1.setForeground(new Color(93,93,93));
        add(lblLbl_1);
        
        Font font2 = new Font("¸¼Àº °íµñ", Font.BOLD, 22);
        lblLbl_1.setFont(font2);
        
        textField = new JTextField();
        textField.setBounds(167, 180, 200, 30);
        add(textField);
        
        JButton btn = new JButton("ÃæÀü");
        btn.setSize(100,80);
        btn.setLocation(400,130);
        btn.setForeground(new Color(255,255,255));
        btn.setBackground(new Color(60,100,255));
        add(btn);
        btn.addActionListener(new MyActionListener());
        Font font3 = new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18);
        btn.setFont(font3);
        
        JButton backBtn = new JButton("µÚ·Î");
        backBtn.setSize(200,40);
        backBtn.setLocation(167, 300);
        backBtn.setForeground(new Color(255,255,255));
        backBtn.setBackground(new Color(255,60,60));
        add(backBtn);
        backBtn.addActionListener(new MyActionListener2());
        backBtn.setFont(font3);
    }
    public void reset(GUIMain win) {
    	win.jpanel11.removeAll();
		win.jpanel11.repaint();
		setLayout(null);
        this.win = win;
        
        JLabel lblLbl_0 = new JLabel("Toy Story");
        lblLbl_0.setBounds(0, 0, 534, 60);
        lblLbl_0.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_0.setOpaque(true);
        lblLbl_0.setForeground(new Color(60,100,255));
        lblLbl_0.setBackground(new Color(255,255,140));
        add(lblLbl_0);
        
        Font font = new Font("¹ÙÅÁÃ¼", Font.BOLD,30);
        lblLbl_0.setFont(font);
        
        JLabel lblLbl = new JLabel("ÇöÀç ÀÜ¾×: " + GUIMain.user.cashPoint + "point");
        lblLbl.setBounds(167, 140, 200, 30);
        add(lblLbl);
        
        JLabel lblLbl_1 = new JLabel("ÃæÀüÆ÷ÀÎÆ®: ");
        lblLbl_1.setBounds(30, 180, 150, 30);
        lblLbl_1.setForeground(new Color(93,93,93));
        add(lblLbl_1);
        
        Font font2 = new Font("¸¼Àº °íµñ", Font.BOLD, 22);
        Font font4 = new Font("¸¼Àº °íµñ", Font.BOLD, 16);
        lblLbl.setFont(font4);
        lblLbl_1.setFont(font2);
        
        textField = new JTextField();
        textField.setBounds(167, 180, 200, 30);
        add(textField);
        
        JButton btn = new JButton("ÃæÀü");
        btn.setSize(100,80);
        btn.setLocation(400,130);
        btn.setForeground(new Color(255,255,255));
        btn.setBackground(new Color(60,100,255));
        add(btn);
        btn.addActionListener(new MyActionListener());
        Font font3 = new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18);
        btn.setFont(font3);
        
        JButton backBtn = new JButton("µÚ·Î");
        backBtn.setSize(200,40);
        backBtn.setLocation(167, 300);
        backBtn.setForeground(new Color(255,255,255));
        backBtn.setBackground(new Color(255,60,60));
        add(backBtn);
        backBtn.addActionListener(new MyActionListener2());
        backBtn.setFont(font3);
    }
    class MyActionListener implements ActionListener {
        UserMgr userMgr = UserMgr.getInstance();
        @Override
        public void actionPerformed(ActionEvent e) {
        	TableSelectionDemo tableDemo = new TableSelectionDemo();
        	int point = Integer.parseInt(textField.getText());
        	GUIMain.user.cashPoint = GUIMain.user.cashPoint + point;
        	tableDemo.completeCharge();
        	win.change("panel03");
        }
    }
    class MyActionListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel03");
        }
    }
}

