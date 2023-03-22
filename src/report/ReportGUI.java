package report;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import guimain.GUIMain;
import login.LoginGUI.MyActionListener;
import login.LoginGUI.MyActionListener2;
import tabledemo.TableSelectionDemo;
import toystore.User;
import toystore.UserMgr;

public class ReportGUI extends JPanel {
		private JTextField textField;
	    private GUIMain win;
	    public ReportGUI(GUIMain win) {
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
	        
	        JLabel lblLbl = new JLabel("신고할 유저의 아이디를 입력하세요!");
	        lblLbl.setBounds(137, 100, 260, 30);
	        add(lblLbl);
	        
	        Font font2 = new Font("굴림체", Font.BOLD, 15);
	        lblLbl.setFont(font2);
	        
	        textField = new JTextField();
	        textField.setBounds(152, 150, 230, 30);
	        add(textField);
	       
	        JButton reportBtn = new JButton("신고하기");
	        reportBtn.setSize(230,40);
	        reportBtn.setLocation(152, 200);
	        reportBtn.setForeground(new Color(255,255,255));
	        reportBtn.setBackground(new Color(255,180,60));
	        add(reportBtn);
	        reportBtn.addActionListener(new MyActionListener());
	        
	        Font font3 = new Font("나눔고딕코딩", Font.BOLD, 18);
	        reportBtn.setFont(font3);
	        
	        JButton backBtn = new JButton("뒤로");
	        backBtn.setSize(200,40);
	        backBtn.setLocation(167,300);
	        backBtn.setForeground(new Color(255,255,255));
	        backBtn.setBackground(new Color(255,60,60));
	        add(backBtn);
	        backBtn.addActionListener(new MyActionListener2());
	        backBtn.setFont(font3);
	    }
	    class MyActionListener implements ActionListener {         // 버튼 키 눌리면 패널 1번 호출 //여기에 로그인 조건달기
	        UserMgr userMgr = UserMgr.getInstance();
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	TableSelectionDemo tableDemo = new TableSelectionDemo();
	        	String id = textField.getText();
	        	User badUser = userMgr.getUser(id);
	        	if (badUser != null) {
	        		badUser.warningPoint++;
	        		if (badUser.warningPoint == 3) {
	        			userMgr.deleteUser(badUser);
	        		}
	        		tableDemo.report();
	        	}
	        	win.change("panel03");
	        }
	    }
	    class MyActionListener2 implements ActionListener {         // 버튼 키 눌리면 패널 1번 호출 //여기에 로그인 조건달기
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	win.change("panel03");
	        }
	    }

}
