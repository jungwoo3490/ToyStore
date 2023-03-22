package toystore;
import java.util.Calendar;
import java.util.Scanner;

import facade.UIData;
import mgr.Manageable;

public class Order implements Manageable, UIData {
	public String type;//대여인지 구매인지
	String date;
	public String name;
	public String buyerId;
	public String kind;
	//NewToy newToy;
	int borrowPrice;
	int price;
	public int totalPrice;
	int period = 0;
	int year;
	int month;
	int day;
	public void getOrderDate() {
		Calendar now = Calendar.getInstance();
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1;
		day = now.get(Calendar.DAY_OF_MONTH);
		date = year + "." + month + "." + day;
	}
	@Override
	public void read(Scanner scan) {
		buyerId = scan.next();
		type = scan.next();
		name = scan.next();
		kind = scan.next();
		totalPrice = scan.nextInt();
		date = scan.next();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean matches(String kwd) {
		if (buyerId.contains(kwd)) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void set(Object[] uitexts) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String[] getUiTexts() {
		// TODO Auto-generated method stub
		String[] texts = new String[6];
		texts[0] = type;
		texts[1] = name;
		texts[2] = kind;
		texts[3] = ""+totalPrice;
		texts[4] = date;
		return texts;
	}
}

