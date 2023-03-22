package sell;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import guimain.GUIMain;
import login.SignInGUI.MyActionListener;
import tabledemo.TableSelectionDemo;
import toystore.FancyToyMgr;
import toystore.FancyToy;
import toystore.NewToyMgr;
import toystore.User;
import toystore.UserMgr;

public class SellGUI extends JPanel{
	private JTextField nameField;
	private JTextField kindField;
    private JTextField priceField;
    private JTextField borrowPriceField;
    private JTextField usedTermField;
    private JTextField conditionField;
    private GUIMain win;
    public SellGUI(GUIMain win) {
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
        
        JLabel lblLbl = new JLabel("상품명:");
        lblLbl.setBounds(50, 75, 125, 25);
        lblLbl.setForeground(new Color(93,93,93));
        add(lblLbl);
        
        Font font2 = new Font("맑은 고딕", Font.BOLD,18);
        lblLbl.setFont(font2);
        
        nameField = new JTextField();
        nameField.setBounds(180, 75, 200, 25);
        add(nameField);
        nameField.setColumns(10);
        
        JLabel lblLbl_2 = new JLabel("종류:");
        lblLbl_2.setBounds(50, 115, 125, 25);
        lblLbl_2.setForeground(new Color(93,93,93));
        add(lblLbl_2);
        lblLbl_2.setFont(font2);
        
        kindField = new JTextField();
        kindField.setBounds(180, 115, 200, 25);
        add(kindField);
        
        
        JLabel lblLbl_3 = new JLabel("판매가격: ");
        lblLbl_3.setBounds(50, 155, 125, 25);
        lblLbl_3.setForeground(new Color(93,93,93));
        add(lblLbl_3);
        lblLbl_3.setFont(font2);
        
        priceField = new JTextField();
        priceField.setBounds(180, 155, 200, 25);
        add(priceField);
        
        JLabel lblLbl_4 = new JLabel("대여가격:");
        lblLbl_4.setBounds(50, 195, 125, 25);
        lblLbl_4.setForeground(new Color(93,93,93));
        add(lblLbl_4);
        lblLbl_4.setFont(font2);
        
        borrowPriceField = new JTextField();
        borrowPriceField.setBounds(180, 195, 200, 25);
        add(borrowPriceField);
        
        JLabel lblLbl_5 = new JLabel("사용기간:");
        lblLbl_5.setBounds(50, 235, 125, 25);
        lblLbl_5.setForeground(new Color(93,93,93));
        add(lblLbl_5);
        lblLbl_5.setFont(font2);
        
        usedTermField = new JTextField();
        usedTermField.setBounds(180, 235, 200, 25);
        add(usedTermField);
        
        JLabel lblLbl_6 = new JLabel("상태:");
        lblLbl_6.setBounds(50, 275, 125, 25);
        lblLbl_6.setForeground(new Color(93,93,93));
        add(lblLbl_6);
        lblLbl_6.setFont(font2);
        
        conditionField = new JTextField();
        conditionField.setBounds(180, 275, 200, 25);
        add(conditionField);
       
        JButton sellBtn = new JButton("판매하기");
        sellBtn.setSize(200,40);
        sellBtn.setLocation(67, 310);
        sellBtn.setForeground(new Color(255,255,255));
        sellBtn.setBackground(new Color(60,100,255));
        add(sellBtn);
        sellBtn.addActionListener(new MyActionListener());
        
        Font font3 = new Font("나눔고딕코딩", Font.BOLD,18);
        sellBtn.setFont(font3);
        
        JButton backBtn = new JButton("뒤로");
        backBtn.setSize(200,40);
        backBtn.setLocation(267, 310);
        backBtn.setForeground(new Color(255,255,255));
        backBtn.setBackground(new Color(255,60,60));
        add(backBtn);
        backBtn.addActionListener(new MyActionListener2());
        backBtn.setFont(font3);
    }
    class MyActionListener implements ActionListener {     
        FancyToyMgr fancyToyMgr = FancyToyMgr.getInstance();
        @Override
        public void actionPerformed(ActionEvent e) {
        	TableSelectionDemo tableDemo = new TableSelectionDemo();
        	String name = nameField.getText();
        	String kind = kindField.getText();
        	int price = Integer.parseInt(priceField.getText());
        	int borrowPrice = Integer.parseInt(borrowPriceField.getText());
        	String usedTerm = usedTermField.getText();
        	String condition = conditionField.getText();
        	FancyToy toy;
        	toy = fancyToyMgr.setToyInformation(name, kind, price, borrowPrice, usedTerm, condition, GUIMain.user.userid);
        	fancyToyMgr.sellToy(toy);
        	tableDemo.completeSell();
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