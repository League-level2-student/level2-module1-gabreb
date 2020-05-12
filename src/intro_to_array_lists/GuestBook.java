package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String f = "";
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook b = new GuestBook();
		b.run();
	}
	void run() {
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		b1.setText("Add Name");
		b2.setText("View Names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.pack();
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		f = "";
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed==b1) {
			String answer = JOptionPane.showInputDialog("Enter a name to the ArrayList");
			names.add(answer);
		}
		else if (buttonPressed==b2) {
			for (int i = 0; i < names.size(); i++) {
				names.set(i,"Guest " + "#" + (i+1) + ": " + names.get(i)+"\n");
				f = f +names.get(i);
			}
			
			JOptionPane.showMessageDialog(null,f);
		}
	}
}
