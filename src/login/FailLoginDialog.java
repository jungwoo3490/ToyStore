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
		setTitle("�α��� ����");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("�ش��ϴ� ���̵�/��й�ȣ�� �����ϴ�!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
}