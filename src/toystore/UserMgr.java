package toystore;

import java.util.List;

import facade.DataEngineInterface;
import mgr.Manageable;
import mgr.Manager;
//유저토이매니저 만들기
public class UserMgr implements DataEngineInterface {
	private static UserMgr mgr = null;
	private UserMgr() {}
	public static UserMgr getInstance() {
		if (mgr == null)
			mgr = new UserMgr();
		return mgr;
	}
	private String[] headers = {"이름", "종류", "가격", "추천연령"};
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
	public User Login(String id) {
		User user;
		user = (User)Store.userMgr.find(id);
		return user;
	}
	public User setUserInformation(String name, String id, String passWord) {
		User user = new User();
		user.name = name;
		user.userid = id;
		user.password = passWord;
		return user;
	}
	public void addNewUser(User user) {
		Store.userMgr.mList.add(user);
	}
	public String getUserId(User user) {
		if (user != null) {
			return user.userid;
		}
		else {
			return "";
		}
	}
	public User getUser(String id) {
		User user = new User();
		user = (User)Store.userMgr.find(id);
		return user;
	}
	public void deleteUser(User user) {
		Store.userMgr.mList.remove(user);
	}
}

