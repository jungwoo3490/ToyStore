package cash;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NoCashDialog extends javax.swing.JDialog {
	public NoCashDialog(){
		setLocation(680, 330);
	}
	public void setup() {
		setTitle("�ܾ� ����");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("����Ʈ�� �����մϴ�!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
}