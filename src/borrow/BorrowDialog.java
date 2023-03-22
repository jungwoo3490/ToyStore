package borrow;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import login.LoginGUI.MyActionListener;
import tabledemo.TableSelectionDemo;
import toystore.Order;
import toystore.OrderMgr;
import toystore.FancyToy;
import toystore.User;
import toystore.UserMgr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import guimain.GUIMain;
public class BorrowDialog extends javax.swing.JDialog {
	JTextField periodText = new JTextField(5);
	String[] itemDetails;
	JLabel details[] = new JLabel[8];
	public BorrowDialog(String[] texts) {
		itemDetails = texts;
		setLocation(580, 300);
	}
	public void setup() {
		setTitle("상품상세보기");
		JPanel pane = new JPanel(new BorderLayout());
		JPanel lpane = new JPanel(new GridLayout(3, 1));
		details[0] = new JLabel("이름: " + itemDetails[1]);
		details[1] = new JLabel("종류: " + itemDetails[2]);
		details[2] = new JLabel("대여가격: " + itemDetails[3]);
		details[3] = new JLabel("사용기간: " + itemDetails[5]);
		lpane.add(details[0]);
		lpane.add(details[1]);
		lpane.add(details[2]);
		lpane.add(details[3]);
		details[0].setForeground(new Color(93,93,93));
		details[1].setForeground(new Color(93,93,93));
		details[2].setForeground(new Color(93,93,93));
		details[3].setForeground(new Color(93,93,93));
		details[0].setHorizontalAlignment(JLabel.CENTER);
		details[1].setHorizontalAlignment(JLabel.CENTER);
		details[2].setHorizontalAlignment(JLabel.CENTER);
		details[3].setHorizontalAlignment(JLabel.CENTER);
		Font font = new Font("맑은 고딕", Font.BOLD, 24);
		details[0].setFont(font);
		details[1].setFont(font);
		details[2].setFont(font);
		details[3].setFont(font);
		JPanel bottom = new JPanel();
		JLabel label = new JLabel("대여기간: ");
		label.setForeground(new Color(93,93,93));
		label.setFont(font);
        JButton borrowBtn = new JButton("대여");
        borrowBtn.setForeground(new Color(255,255,255));
        borrowBtn.setBackground(new Color(60,100,255));
        Font font2 = new Font("나눔고딕코딩", Font.BOLD, 18);
        borrowBtn.setFont(font2);
        borrowBtn.addActionListener(new MyActionListener());
        bottom.setSize(300, 100);
        bottom.add(label, BorderLayout.LINE_START);
        bottom.add(periodText, BorderLayout.CENTER);
        bottom.add(borrowBtn, BorderLayout.LINE_END);
		pane.add(lpane, BorderLayout.CENTER);
		pane.add(bottom, BorderLayout.SOUTH);
		this.setMinimumSize(new Dimension(400, 300));
		setContentPane(pane);
	}
	 class MyActionListener implements ActionListener { 
	       	OrderMgr orderMgr = OrderMgr.getInstance();
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	TableSelectionDemo tableDemo = new TableSelectionDemo();
	        	int period = Integer.parseInt(periodText.getText());
	        	if (GUIMain.user.cashPoint >= Integer.parseInt(itemDetails[3]) * period) {
	        		Order order = new Order();
	        		order.buyerId = GUIMain.user.userid;
	        		order.name = itemDetails[1];
	        		order.kind = itemDetails[2];
	        		order.type = "대여";
	        		order.totalPrice = Integer.parseInt(itemDetails[3]) * period;
	        		orderMgr.addOrder(order);
	        		GUIMain.user.cashPoint -= Integer.parseInt(itemDetails[3]) * period;
	        		tableDemo.completeBuy();
	        	}
	        	else {
	        		tableDemo.noCash();
	        	}
	        }
	 }
}