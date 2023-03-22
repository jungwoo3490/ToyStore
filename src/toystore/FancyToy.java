package toystore;
import java.util.Scanner;
import mgr.Manageable;
import facade.UIData;
public class FancyToy implements Manageable, UIData {
	public String sellerId;
	public String name;
	public String kind;
	public int borrowPrice;
	public int price;
	public String recommendAge;
	String usedTerm;
	String condition;
	public void read(Scanner scan) {
		sellerId = scan.next();
		name = scan.next();
		kind = scan.next();
		price = scan.nextInt();
		borrowPrice = scan.nextInt();
		usedTerm = scan.next();
		condition = scan.next();
	}
	public void print() {
		print(true);
	}
	public void print(boolean b) {
		if (b == true) {
			System.out.printf("[%s] �뿩(1��): %d��  ����: %d�� ��õ ����: %s  ��� �Ⱓ: %s  ����: %s ",
					name, borrowPrice, price, recommendAge, usedTerm, condition);
		}
		else {
			System.out.printf("[%s] ��õ ����: %s  ��� �Ⱓ: %s  ����: %s (�Ǹ���: %s) ",
					name, recommendAge, usedTerm, condition, sellerId);
		}
	}
	public boolean matches(String kwd) {
		if (name.contains(kwd)) {
			return true;
		}
		if (sellerId.contains(kwd)) {
			return true;
		}
		return false;
	}
	@Override
	public void set(Object[] uitexts) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String[] getUiTexts() {
		String[] texts = new String[8];
		texts[0] = sellerId;
		texts[1] = name;
		texts[2] = kind;
		texts[3] = ""+borrowPrice;
		texts[4] = ""+price;
		texts[5] = usedTerm;
		texts[6] = condition; 
		return texts;
		// TODO Auto-generated method stub
	}
}