package toystore;

import java.util.List;

import facade.DataEngineInterface;
import mgr.Manageable;
import mgr.Manager;
//�������̸Ŵ��� �����
public class NewToyMgr implements DataEngineInterface {
	private static NewToyMgr mgr = null;
	private NewToyMgr() {}
	public static NewToyMgr getInstance() {
		if (mgr == null)
			mgr = new NewToyMgr();
		return mgr;
	}
	private String[] headers = {"�̸�", "����", "����", "��õ����"};
	public String[] getColumnNames() {
		return headers;
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public void readAll(String filename) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Manageable> search(String kwd) {
		// TODO Auto-generated method stub
		return Store.newToyMgr.findAll(kwd);
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
}

