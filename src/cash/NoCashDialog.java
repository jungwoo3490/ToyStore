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
		setTitle("잔액 부족");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("포인트가 부족합니다!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
}