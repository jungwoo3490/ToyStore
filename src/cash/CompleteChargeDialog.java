package cash;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompleteChargeDialog extends javax.swing.JDialog {
	public CompleteChargeDialog(){
		setLocation(680, 330);
	}
	public void setup() {
		setTitle("���� �Ϸ�");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("������ �Ϸ�Ǿ����ϴ�!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
	

}