package mainmenu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import guimain.GUIMain;
import mainmenu.MainMenuGUI.MyActionListener;
import mainmenu.MainMenuGUI.MyActionListener2;
import mainmenu.MainMenuGUI.MyActionListener3;
import mainmenu.MainMenuGUI.MyActionListener4;
import mainmenu.MainMenuGUI.MyActionListener5;
import mainmenu.MainMenuGUI.MyActionListener6;
import mainmenu.MainMenuGUI.MyActionListener7;
import mainmenu.MainMenuGUI.MyActionListener8;
import mainmenu.MainMenuGUI.MyActionListener9;

public class MainMenuGUI extends JPanel {
    private GUIMain win;
    public MainMenuGUI(GUIMain win) {
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
        
        JButton InfoBtn = new JButton("내 정보");
        InfoBtn.setSize(200,40);
        InfoBtn.setLocation(30, 75);
        InfoBtn.setForeground(new Color(255,255,255));
        InfoBtn.setBackground(new Color(60,100,255));
        add(InfoBtn);
        InfoBtn.addActionListener(new MyActionListener());
        Font font2 = new Font("나눔고딕코딩", Font.BOLD,18);
        InfoBtn.setFont(font2);
        JButton newToyBtn = new JButton("신상장난감 구매");
        newToyBtn.setSize(200,40);
        newToyBtn.setLocation(30, 130);
        newToyBtn.setForeground(new Color(255,255,255));
        newToyBtn.setBackground(new Color(40,200,0));
        add(newToyBtn);
        newToyBtn.addActionListener(new MyActionListener2());
        newToyBtn.setFont(font2);
        JButton fancyToyBtn = new JButton("중고장난감 구매/대여");
        fancyToyBtn.setSize(200,40);
        fancyToyBtn.setLocation(307, 130);
        fancyToyBtn.setForeground(new Color(255,255,255));
        fancyToyBtn.setBackground(new Color(40,200,0));
        add(fancyToyBtn);
        fancyToyBtn.addActionListener(new MyActionListener3());
        Font font3 = new Font("나눔고딕코딩", Font.BOLD,16);
        fancyToyBtn.setFont(font3);
        JButton sellBtn = new JButton("중고장난감 판매");
        sellBtn.setSize(200,40);
        sellBtn.setLocation(307, 75);
        sellBtn.setForeground(new Color(255,255,255));
        sellBtn.setBackground(new Color(60,100,255));
        add(sellBtn);
        sellBtn.addActionListener(new MyActionListener4());
        sellBtn.setFont(font2);
        JButton sellListBtn = new JButton("판매 내역");
        sellListBtn.setSize(200,40);
        sellListBtn.setLocation(30, 185);
        sellListBtn.setForeground(new Color(255,255,255));
        sellListBtn.setBackground(new Color(255,220,60));
        add(sellListBtn);
        sellListBtn.addActionListener(new MyActionListener5());
        sellListBtn.setFont(font2);
        JButton orderListBtn = new JButton("구매 내역");
        orderListBtn.setSize(200,40);
        orderListBtn.setLocation(307, 185);
        orderListBtn.setForeground(new Color(255,255,255));
        orderListBtn.setBackground(new Color(255,220,60));
        add(orderListBtn);
        orderListBtn.addActionListener(new MyActionListener6());
        orderListBtn.setFont(font2);
        JButton reportBtn = new JButton("신고");
        reportBtn.setSize(200,40);
        reportBtn.setLocation(30, 240);
        reportBtn.setForeground(new Color(255,255,255));
        reportBtn.setBackground(new Color(255,180,60));
        add(reportBtn);
        reportBtn.addActionListener(new MyActionListener7());
        reportBtn.setFont(font2);
        JButton chargeBtn = new JButton("캐시포인트 충전");
        chargeBtn.setSize(200,40);
        chargeBtn.setLocation(307, 240);
        chargeBtn.setForeground(new Color(255,255,255));
        chargeBtn.setBackground(new Color(255,180,60));
        add(chargeBtn);
        chargeBtn.addActionListener(new MyActionListener8());
        chargeBtn.setFont(font2);
        JButton logOutBtn = new JButton("로그아웃");
        logOutBtn.setSize(200,40);
        logOutBtn.setLocation(167, 300);
        logOutBtn.setForeground(new Color(255,255,255));
        logOutBtn.setBackground(new Color(255,60,60));
        add(logOutBtn);
        logOutBtn.addActionListener(new MyActionListener9());
        logOutBtn.setFont(font2);
    }
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel04");
        }
    }
    class MyActionListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel05");
        }
    }
    class MyActionListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel06");
        }
    }
    class MyActionListener4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel07");
        }
    }
    class MyActionListener5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel08");
        }
    }
    class MyActionListener6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel09");
        }
    }
    class MyActionListener7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel10");
        }
    }
    class MyActionListener8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel11");
        }
    }
    class MyActionListener9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	win.change("panel01");
        }
    }
    
}
