package login;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompleteSignInDialog extends javax.swing.JDialog {
	public CompleteSignInDialog(){
		setLocation(680, 330);
	}
	public void setup() {
		setTitle("ȸ������ �Ϸ�");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("ȸ�������� �Ϸ�Ǿ����ϴ�!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}

}
