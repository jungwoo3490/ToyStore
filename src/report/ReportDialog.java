package report;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReportDialog extends javax.swing.JDialog {
	public ReportDialog(){
		setLocation(680, 330);
	}
	public void setup() {
		setTitle("�Ű� �Ϸ�");
		JPanel pane = new JPanel(new BorderLayout());
		JLabel text = new JLabel("�Ű� �Ϸ�Ǿ����ϴ�!");
		pane.add(text, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(200, 150));
		setContentPane(pane);
	}
}
