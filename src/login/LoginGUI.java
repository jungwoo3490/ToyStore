package login;

import javax.swing.*;

import guimain.GUIMain;
import tabledemo.TableSelectionDemo;
import toystore.UserMgr;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
public class LoginGUI extends JPanel{
    private JTextField textField;
    private JPasswordField passwordField;
    private GUIMain win;
    public static String updateId = "jungwoo3490";
    public LoginGUI(GUIMain win) {
        setLayout(null);
        this.win = win;
        
        JLabel lblLbl_0 = new JLabel("Toy Story");
        lblLbl_0.setBounds(0, 0, 534, 60);
        lblLbl_0.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_0.setOpaque(true);
        lblLbl_0.setForeground(new Color(60,100,255));
        lblLbl_0.setBackground(new Color(255,255,140));
        add(lblLbl_0);
        
        Font font = new Font("바탕체", Font.BOLD,30);
        lblLbl_0.setFont(font);
        
        JLabel lblLbl = new JLabel("아이디:");
        lblLbl.setBounds(30, 130, 125, 30);
        lblLbl.setForeground(new Color(93,93,93));
        add(lblLbl);
        
        Font font2 = new Font("맑은 고딕", Font.BOLD, 24);
        lblLbl.setFont(font2);
        
        textField = new JTextField();
        textField.setBounds(155, 130, 200, 30);
        add(textField);
        textField.setColumns(10);
        
        JLabel lblLbl_1 = new JLabel("비밀번호:");
        lblLbl_1.setBounds(30, 180, 125, 30);
        lblLbl_1.setForeground(new Color(93,93,93));
        add(lblLbl_1);
        lblLbl_1.setFont(font2);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(155, 180, 200, 30);
        add(passwordField);
        
        JButton btn = new JButton("로그인");
        btn.setSize(100,80);
        btn.setLocation(400,130);
        btn.setForeground(new Color(255,255,255));
        btn.setBackground(new Color(60,100,255));
        add(btn);
        Font font3 = new Font("나눔고딕코딩", Font.BOLD,18);
        btn.setFont(font3);
        btn.addActionListener(new MyActionListener());
        JButton signInBtn = new JButton("회원가입");
        signInBtn.setSize(200,30);
        signInBtn.setLocation(155, 230);
        signInBtn.setForeground(new Color(255,255,255));
        signInBtn.setBackground(new Color(60,100,255));
        add(signInBtn);
        signInBtn.addActionListener(new MyActionListener2());
        signInBtn.setFont(font3);
    }
    public class MyActionListener implements ActionListener {
        UserMgr userMgr = UserMgr.getInstance();
        @Override
        public void actionPerformed(ActionEvent e) {
        	TableSelectionDemo tableDemo = new TableSelectionDemo();
        	String id = textField.getText();
        	String passWord = passwordField.getText();
        	GUIMain.user = userMgr.Login(id);
        	if (GUIMain.user != null) {
        		if (passWord.equals(GUIMain.user.password)) {
        			updateId = id;
        			win.change("panel03");
        		}
        		else {
        			GUIMain.user = null;
            		tableDemo.failLogin();
            	}
        	}
        	else {
        		tableDemo.failLogin();
        	}
        }
    }
    public class MyActionListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel02");
        }
    }
}