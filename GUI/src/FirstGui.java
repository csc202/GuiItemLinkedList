
import javax.swing.*;

import edu.nvcc.kanchanawanchai.csc202.ItemLinkedList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGui extends JPanel implements ActionListener{
	JButton jbtSearch = new JButton("SEARCH");
	JButton jbtInsert = new JButton("INSERT");
	JLabel jlbSearchItem = new JLabel("Enter the item to search");
	JTextField jtfName = new JTextField(20);
	ItemLinkedList <String>iLL = new ItemLinkedList<String>();
	public FirstGui() {
	    
	    iLL.insert("Debbie");
	    iLL.insert("Christopher");
	    iLL.insert("Aleksey");
	    
		setBackground(Color.PINK);
		jbtSearch.addActionListener(this);
		jbtInsert.addActionListener(this);
		
		add(jlbSearchItem);
		add(jtfName);
		add(jbtSearch);
		add(jbtInsert);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("SEARCH"))
			JOptionPane.showMessageDialog(this, iLL.find(jtfName.getText()));
		else if(e.getActionCommand().equalsIgnoreCase("INSERT")) {
			iLL.insert(jtfName.getText());
			JOptionPane.showMessageDialog(this,jtfName.getText()+ " is inserted." );
		}
	}
	
}
