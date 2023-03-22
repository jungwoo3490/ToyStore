package toystore;
import java.util.ArrayList;
import java.util.Scanner;

import mgr.Manageable;

public class User implements Manageable {
	public ArrayList<FancyToy> sellList = new ArrayList<>();
	ArrayList<Order> orderList = new ArrayList<>();
	ArrayList<Manageable> searchToyList = new ArrayList<>();
	public String name;
	public String userid;
	public String password;
	public int cashPoint = 0;
	public int warningPoint = 0;
	public double rate = 0;
	int totalRatedPoint = 0;
	int howManyRated = 0;
	int howManySell = 0;
	Store store = Store.getInstance();
	public void read(Scanner scan) {
		read(scan, true);
	}
	public void read(Scanner scan, boolean b) {
		if (b == true) {
			name = scan.next();
			userid = scan.next();
			password = scan.next();
		}
		else {
			System.out.print("이름: ");
			name = scan.next();
			System.out.print("아이디 :");
			userid = scan.next();
			System.out.print("비밀번호 :");
			password = scan.next();
		}
	}
	public void print() {
		System.out.printf("이름: %s\n", name);
		System.out.printf("Id: %s\n", userid);
		System.out.printf("현재 잔액: %dpoint\n", cashPoint);
		System.out.printf("신고 누적 횟수: %d회\n", warningPoint);
		System.out.printf("평점: %.2f\n", rate);
	}
	public boolean matches(String kwd) {
		if(kwd.contentEquals(userid)) {
			return true;
		}
		return false;
	}
}
