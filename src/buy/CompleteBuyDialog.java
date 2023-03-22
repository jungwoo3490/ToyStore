package buy;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompleteBuyDialog extends javax.swing.JDialog {
	public CompleteBuyDialog(){
		setLocation(680, 330);
	}
	public void setup() {
		setTitle("결제 완료");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("결제가 완료되었습니다!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
}
