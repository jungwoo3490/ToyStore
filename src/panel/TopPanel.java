package panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import list.NewToyListGUI.MyActionListener;
import tabledemo.TableSelectionDemo;

public class TopPanel extends JPanel {
    public void setupTopPane(TableSelectionDemo tableDemo) {
    	JPanel topPane = new JPanel();
        Font font = new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18);
        JTextField kwdTextField = new JTextField("", 20);
        topPane.add(kwdTextField, BorderLayout.LINE_START);
        JButton search = new JButton("°Ë»ö");
        search.setForeground(new Color(255,255,255));
        search.setBackground(new Color(40,200,0));
        search.setFont(font);
        topPane.add(search, BorderLayout.CENTER);
        add(topPane, BorderLayout.PAGE_START);

        search.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (e.getActionCommand().equals("°Ë»ö")) {
        			tableDemo.loadData(kwdTextField.getText());
            	}
           }
        });
    }
}