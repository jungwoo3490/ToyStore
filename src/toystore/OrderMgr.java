package toystore;

import java.util.List;

import facade.DataEngineInterface;
import mgr.Manageable;

public class OrderMgr implements DataEngineInterface {
	private static OrderMgr mgr = null;
	private OrderMgr() {}
	public static OrderMgr getInstance() {
		if (mgr == null)
			mgr = new OrderMgr();
		return mgr;
	}
	private String[] headers = {"구매/대여", "상품명", "종류", "결제가격", "결제일시"};
	public String[] getColumnNames() {
		return headers;
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5;
	}
	@Override
	public void readAll(String filename) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Manageable> search(String kwd) {
		// TODO Auto-generated method stub
		return Store.orderMgr.findAll(kwd);
	}
	@Override
	public void addNewItem(String[] uiTexts) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(String[] uiTexts) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(String kwd) {
		// TODO Auto-generated method stub
		
	}
	public void addOrder(Order order) {
		order.getOrderDate();
		Store.orderMgr.mList.add(order);
	}
}
