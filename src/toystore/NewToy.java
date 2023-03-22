package toystore;
import java.util.Scanner;

import mgr.Manageable;
import facade.UIData;

public class NewToy implements Manageable, UIData {
	public String name;
	public String kind;
	public int price;
	public String recommendAge;
	@Override
	public void read(Scanner scan) {
		name = scan.next();
		kind = scan.next();
		price = scan.nextInt();
		recommendAge = scan.next();
		// TODO Auto-generated method stub
	}
	@Override
	public void print() {
		print(true);
		// TODO Auto-generated method stub
	}
	public void print(boolean b) {
		if (b == true) {
			System.out.printf("[%s] (%s) 가격: %d 추천 연령: %s\n",
				name, kind, price, recommendAge);
		}
		else {
			System.out.printf("[%s] (%s) 가격: %d 추천 연령: %s ",
					name, kind, price, recommendAge);
		}
		// TODO Auto-generated method stub
	}
	@Override
	public boolean matches(String kwd) {
		if (name.contains(kwd)) {
			return true;
		}
		if (kind.contentEquals(kwd)) {
			return true;
		}
		return false;
		// TODO Auto-generated method stub
	}
	@Override
	public void set(Object[] uitexts) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String[] getUiTexts() {
		// TODO Auto-generated method stub
		String[] texts = new String[5];
		texts[0] = name;
		texts[1] = kind;
		texts[2] = ""+price;
		texts[3] = recommendAge;
		return texts;
	}
}
