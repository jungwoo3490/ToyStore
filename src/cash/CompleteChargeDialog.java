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
		setTitle("충전 완료");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("충전이 완료되었습니다!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
	

}