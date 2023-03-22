package guimain;

import javax.swing.*;

import cash.CashPointGUI;
import list.FancyToyListGUI;
import list.NewToyListGUI;
import list.OrderListGUI;
import list.SellListGUI;
import login.LoginGUI;
import login.SignInGUI;
import mainmenu.MainMenuGUI;
import report.ReportGUI;
import sell.SellGUI;
import toystore.Store;
import toystore.User;
import toystore.UserMgr;
import userinfo.UserInformationGUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUIMain extends JFrame{
	GUIMain(){
		setLocation(500, 200);
	}
	static Store store = Store.getInstance();
	static UserMgr userMgr = UserMgr.getInstance();
	public static User user = userMgr.getUser("jungwoo3490");
    public LoginGUI jpanel01 = null;
    public SignInGUI jpanel02 = null;
    public MainMenuGUI jpanel03 = null;
    public UserInformationGUI jpanel04 = null;
    public NewToyListGUI jpanel05 = null;
    public FancyToyListGUI jpanel06 = null;
    public SellGUI jpanel07 = null;
    public SellListGUI jpanel08 = null;
    public OrderListGUI jpanel09 = null;
    public ReportGUI jpanel10 = null;
    public CashPointGUI jpanel11 = null;
    public void change(String panelName){
        
        if(panelName.equals("panel01")){
            getContentPane().removeAll();
            getContentPane().add(jpanel01);
            revalidate();
            repaint();
        }else if (panelName.equals("panel02")) {
        	getContentPane().removeAll();
            getContentPane().add(jpanel02);
            revalidate();
            repaint();
        }else if (panelName.equals("panel03")) {
        	getContentPane().removeAll();
            getContentPane().add(jpanel03);
            revalidate();
            repaint();
        }else if (panelName.equals("panel04")) {
        	getContentPane().removeAll();
        	win.jpanel04.reset(win);
            getContentPane().add(jpanel04);
            revalidate();
            repaint();
        }else if (panelName.equals("panel05")) {
        	getContentPane().removeAll();
        	win.jpanel05.reset(win);
            getContentPane().add(jpanel05);
            revalidate();
            repaint();
        }else if (panelName.equals("panel06")) {
        	getContentPane().removeAll();
        	win.jpanel06.reset(win);
            getContentPane().add(jpanel06);
            revalidate();
            repaint();
        }else if (panelName.equals("panel07")) {
        	getContentPane().removeAll();
            getContentPane().add(jpanel07);
            revalidate();
            repaint();
        }else if (panelName.equals("panel08")) {
        	getContentPane().removeAll();
        	win.jpanel08.reset(win);
            getContentPane().add(jpanel08);
            revalidate();
            repaint();
        }else if (panelName.equals("panel09")) {
        	getContentPane().removeAll();
        	win.jpanel09.reset(win);
            getContentPane().add(jpanel09);
            revalidate();
            repaint();
        }else if (panelName.equals("panel10")) {
        	getContentPane().removeAll();
            getContentPane().add(jpanel10);
            revalidate();
            repaint();
        }else {
        	getContentPane().removeAll();
        	win.jpanel11.reset(win);
            getContentPane().add(jpanel11);
            revalidate();
            repaint();
        }
    }
    static GUIMain win = new GUIMain();
    public static void main(String[] args) {
    	store.run();            
        win.setTitle("Toy Story");
        win.jpanel01 = new LoginGUI(win);
        win.jpanel02 = new SignInGUI(win);
        win.jpanel03 = new MainMenuGUI(win);
        win.jpanel04 = new UserInformationGUI(win);
        win.jpanel05 = new NewToyListGUI(win);
        win.jpanel06 = new FancyToyListGUI(win);
        win.jpanel07 = new SellGUI(win);
        win.jpanel08 = new SellListGUI(win);
        win.jpanel09 = new OrderListGUI(win);
        win.jpanel10 = new ReportGUI(win);
        win.jpanel11 = new CashPointGUI(win);
        win.add(win.jpanel01);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(550,400);
        win.setVisible(true);    
    }
}
