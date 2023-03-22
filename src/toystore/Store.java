package toystore;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class Store {
	private static Store store = null;
	private Store() {}
	public static Store getInstance() {
		if (store == null)
			store = new Store();
		return store;
	}
	static Manager userMgr = new Manager();
	static Manager newToyMgr = new Manager();
	public static Manager fancyToyMgr = new Manager();
	public static Manager orderMgr = new Manager();
	Scanner scan = new Scanner(System.in);
	public void run() {
		User user;
		int menu;
		userMgr.readAll("users.txt", new Factory() {
			public Manageable create() {
				return new User();
			}
		});
		newToyMgr.readAll("newToys.txt", new Factory() {
			public Manageable create() {
				return new NewToy();
			}
		});
		fancyToyMgr.readAll("toys.txt", new Factory() {
			public Manageable create() {
				return new FancyToy();
			}
		});
		orderMgr.readAll("order.txt", new Factory() {
			public Manageable create() {
				return new Order();
			}
		});
	}	
	public static void main(String args[]) {
		Store store = new Store();
		store.run();
	}
}