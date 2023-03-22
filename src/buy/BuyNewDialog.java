package buy;

import javax.swing.JLabel;
import javax.swing.JPanel;

import guimain.GUIMain;
import login.LoginGUI.MyActionListener;
import tabledemo.TableSelectionDemo;
import toystore.NewToy;
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

public class BuyNewDialog extends javax.swing.JDialog {
	String[] itemDetails;
	JLabel details[] = new JLabel[5];
	public BuyNewDialog(String[] texts) {
		itemDetails = texts;
		setLocation(580, 300);
	}
	public void setup() {
		setTitle("��ǰ�󼼺���");
		JPanel pane = new JPanel(new BorderLayout());
		JPanel lpane = new JPanel(new GridLayout(3, 1));
		details[0] = new JLabel("�̸�: " + itemDetails[0]);
		details[1] = new JLabel("����: " + itemDetails[1]);
		details[2] = new JLabel("����: " + itemDetails[2]);
		details[3] = new JLabel("��õ����: " + itemDetails[3]);
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
		Font font = new Font("���� ���", Font.BOLD, 24);
		details[0].setFont(font);
		details[1].setFont(font);
		details[2].setFont(font);
		details[3].setFont(font);
		JPanel bottom = new JPanel();
		JButton buyBtn = new JButton("����");
		buyBtn.setForeground(new Color(255,255,255));
        buyBtn.setBackground(new Color(60,100,255));
        Font font2 = new Font("��������ڵ�", Font.BOLD, 18);
        buyBtn.setFont(font2);
		buyBtn.addActionListener(new MyActionListener());
        bottom.add(buyBtn, BorderLayout.CENTER);
		pane.add(lpane, BorderLayout.CENTER);
		pane.add(bottom, BorderLayout.SOUTH);
		this.setMinimumSize(new Dimension(400, 150));
		setContentPane(pane);
	}
	class MyActionListener implements ActionListener {
        UserMgr userMgr = UserMgr.getInstance();
        OrderMgr orderMgr = OrderMgr.getInstance();
        @Override
        public void actionPerformed(ActionEvent e) {
        	TableSelectionDemo tableDemo = new TableSelectionDemo();
        	if (GUIMain.user.cashPoint >= Integer.parseInt(itemDetails[2])) {
        		Order order = new Order();
        		order.buyerId = GUIMain.user.userid;
        		order.name = itemDetails[0];
        		order.kind = itemDetails[1];
        		order.type = "����";
        		order.totalPrice = Integer.parseInt(itemDetails[2]);
        		orderMgr.addOrder(order);
        		GUIMain.user.cashPoint -= Integer.parseInt(itemDetails[2]);
        		tableDemo.completeBuy();
        	}
        	else {
        		tableDemo.noCash();
        	}
        }
    }
}

