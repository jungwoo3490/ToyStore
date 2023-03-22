package panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tabledemo.TableSelectionDemo;

public class BottomPanel2 extends JPanel {
    public void setupBottomPane(TableSelectionDemo tableDemo) {
    	JPanel bottomPane = new JPanel();
    	Font font = new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18);
        JButton buyButton = new JButton("±¸¸Å");
        buyButton.setForeground(new Color(255,255,255));
        buyButton.setBackground(new Color(60,100,255));
        buyButton.setFont(font);
        bottomPane.add(buyButton, BorderLayout.CENTER);
        add(bottomPane, BorderLayout.PAGE_END);

        buyButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (e.getActionCommand().equals("±¸¸Å")) {
        			tableDemo.buyNew();
            	}
           }
        });
    }
}
