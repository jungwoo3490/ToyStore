package toystore;

import java.util.List;

import facade.DataEngineInterface;
import mgr.Manageable;

public class FancyToyMgr implements DataEngineInterface {
	private static FancyToyMgr mgr = null;
	private FancyToyMgr() {}
	public static FancyToyMgr getInstance() {
		if (mgr == null)
			mgr = new FancyToyMgr();
		return mgr;
	}
	private String[] headers = {"판매자", "이름", "종류", "대여가격(1일)", "판매가격", "사용기간", "상태"};
	public String[] getColumnNames() {
		return headers;
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}
	@Override
	public void readAll(String filename) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Manageable> search(String kwd) {
		// TODO Auto-generated method stub
		return Store.fancyToyMgr.findAll(kwd);
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
	public void sellToy(FancyToy toy) {
		Store.fancyToyMgr.mList.add(toy);
	}
	public FancyToy setToyInformation(String name, String kind, int price, int borrowPrice, String usedTerm, String condition, String userId) {
		FancyToy toy = new FancyToy();
		toy.name = name;
		toy.kind = kind;
		toy.price = price;
		toy.borrowPrice = borrowPrice;
		toy.usedTerm = usedTerm;
		toy.condition = condition;
		toy.sellerId = userId;
		return toy;
	}
}

