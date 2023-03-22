package userinfo;

import javax.swing.*;

import guimain.GUIMain;
import toystore.User;
import toystore.UserMgr;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
public class UserInformationGUI extends JPanel{        // 4번 패널
    private GUIMain win;
    static UserMgr userMgr = UserMgr.getInstance();
    public UserInformationGUI(GUIMain win) {
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
        
        GUIMain.user = userMgr.getUser("jungwoo3490");
        JLabel lblLbl = new JLabel("이름: " + GUIMain.user.name);
        lblLbl.setBounds(167, 80, 200, 30);
        lblLbl.setHorizontalAlignment(JLabel.CENTER);
        lblLbl.setForeground(new Color(93,93,93));
        add(lblLbl);
        
        Font font2 = new Font("나눔고딕코딩", Font.BOLD,18);
        lblLbl.setFont(font2);
        
        JLabel lblLbl_1 = new JLabel("아이디: " + GUIMain.user.userid);
        lblLbl_1.setBounds(167, 130, 200, 30);
        lblLbl_1.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_1.setForeground(new Color(93,93,93));
        add(lblLbl_1);
        lblLbl_1.setFont(font2);
        
        JLabel lblLbl_2 = new JLabel("현재 잔액: " + GUIMain.user.cashPoint);
        lblLbl_2.setBounds(167, 180, 200, 30);
        lblLbl_2.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_2.setForeground(new Color(93,93,93));
        add(lblLbl_2);
        lblLbl_2.setFont(font2);
        
        JLabel lblLbl_3 = new JLabel("신고 누적 횟수: " + GUIMain.user.warningPoint);
        lblLbl_3.setBounds(167, 230, 200, 30);
        lblLbl_3.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_3.setForeground(new Color(93,93,93));
        add(lblLbl_3);
        lblLbl_3.setFont(font2);
        
       
        JButton backBtn = new JButton("뒤로");
        backBtn.setSize(200,40);
        backBtn.setLocation(167, 300);
        backBtn.setForeground(new Color(255,255,255));
        backBtn.setBackground(new Color(255,60,60));
        add(backBtn);
        backBtn.addActionListener(new MyActionListener());
        backBtn.setFont(font2);
    }
    public void reset(GUIMain win) {
    	win.jpanel04.removeAll();
		win.jpanel04.repaint();
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
        
        JLabel lblLbl = new JLabel("이름: " + GUIMain.user.name);
        lblLbl.setBounds(167, 80, 200, 30);
        lblLbl.setHorizontalAlignment(JLabel.CENTER);
        lblLbl.setForeground(new Color(93,93,93));
        add(lblLbl);
        
        Font font2 = new Font("나눔고딕코딩", Font.BOLD,18);
        lblLbl.setFont(font2);
        
        JLabel lblLbl_1 = new JLabel("아이디: " + GUIMain.user.userid);
        lblLbl_1.setBounds(167, 130, 200, 30);
        lblLbl_1.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_1.setForeground(new Color(93,93,93));
        add(lblLbl_1);
        lblLbl_1.setFont(font2);
        
        JLabel lblLbl_2 = new JLabel("현재 잔액: " + GUIMain.user.cashPoint);
        lblLbl_2.setBounds(167, 180, 200, 30);
        lblLbl_2.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_2.setForeground(new Color(93,93,93));
        add(lblLbl_2);
        lblLbl_2.setFont(font2);
        
        JLabel lblLbl_3 = new JLabel("신고 누적 횟수: " + GUIMain.user.warningPoint);
        lblLbl_3.setBounds(167, 230, 200, 30);
        lblLbl_3.setHorizontalAlignment(JLabel.CENTER);
        lblLbl_3.setForeground(new Color(93,93,93));
        add(lblLbl_3);
        lblLbl_3.setFont(font2);
        
       
        JButton backBtn = new JButton("뒤로");
        backBtn.setSize(200,40);
        backBtn.setLocation(167, 300);
        backBtn.setForeground(new Color(255,255,255));
        backBtn.setBackground(new Color(255,60,60));
        add(backBtn);
        backBtn.addActionListener(new MyActionListener());
        backBtn.setFont(font2);
    }
    class MyActionListener implements ActionListener {         // 버튼 키 눌리면 패널 1번 호출 //여기에 로그인 조건달기
        UserMgr userMgr = UserMgr.getInstance();
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel03");
        }
    }
}
