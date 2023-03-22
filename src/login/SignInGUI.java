package login;

import javax.swing.*;

import guimain.GUIMain;
import tabledemo.TableSelectionDemo;
import toystore.User;
import toystore.UserMgr;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
public class SignInGUI extends JPanel{
    private JTextField nameField;
    private JTextField idField;
    private JTextField passwordField;
    private GUIMain win;
    public SignInGUI(GUIMain win) {
    	
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
        
        JLabel lblLbl = new JLabel("이름:");
        lblLbl.setBounds(30, 80, 125, 30);
        lblLbl.setForeground(new Color(93,93,93));
        add(lblLbl);
        
        Font font2 = new Font("맑은 고딕", Font.BOLD,24);
        lblLbl.setFont(font2);
        
        nameField = new JTextField();
        nameField.setBounds(155, 80, 200, 30);
        add(nameField);
        nameField.setColumns(10);
        
        JLabel lblLbl_1 = new JLabel("아이디:");
        lblLbl_1.setBounds(30, 130, 125, 30);
        lblLbl_1.setForeground(new Color(93,93,93));
        add(lblLbl_1);
        lblLbl_1.setFont(font2);
        
        idField = new JTextField();
        idField.setBounds(155, 130, 200, 30);
        add(idField);
        
        JLabel lblLbl_2 = new JLabel("비밀번호:");
        lblLbl_2.setBounds(30, 180, 125, 30);
        lblLbl_2.setForeground(new Color(93,93,93));
        add(lblLbl_2);
        lblLbl_2.setFont(font2);
        
        passwordField = new JTextField();
        passwordField.setBounds(155, 180, 200, 30);
        add(passwordField);
       
        JButton signInBtn = new JButton("가입하기");
        signInBtn.setSize(200,30);
        signInBtn.setLocation(155, 230);
        signInBtn.setForeground(new Color(255,255,255));
        signInBtn.setBackground(new Color(60,100,255));
        add(signInBtn);
        signInBtn.addActionListener(new MyActionListener());
    }
    public class MyActionListener implements ActionListener {
        UserMgr userMgr = UserMgr.getInstance();
        @Override
        public void actionPerformed(ActionEvent e) {
        	TableSelectionDemo tableDemo = new TableSelectionDemo();
        	String name = nameField.getText();
        	String id = idField.getText();
        	String passWord = passwordField.getText();
        	User user;
        	user = userMgr.setUserInformation(name, id, passWord);
        	userMgr.addNewUser(user);
        	tableDemo.completeSignIn();
        	win.change("panel01");
        }
    }
}
