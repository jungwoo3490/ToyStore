package login;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FailLoginDialog extends javax.swing.JDialog {
	public FailLoginDialog(){
		setLocation(680, 330);
	}
	public void setup() {
		setTitle("로그인 실패");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("해당하는 아이디/비밀번호가 없습니다!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
}