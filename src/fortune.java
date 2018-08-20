import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune implements ActionListener {

	public static void main(String[] args) {
		fortune fc = new fortune();
		fc.showButton();
		
		
	}
	
	public void showButton() {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     System.out.println("Button clicked");
	JButton button=new JButton("click here");
	frame.add(button);
	button.addActionListener(this);
	frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "You will click the button again");
		
		}
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "you feel disappointed in the quality of this answer");
		}
		
		if(rand==2) {
			JOptionPane.showMessageDialog(null, "you will not find the message at the end of the spaces...                                                                                                                                                                                                                                                                                                                                                                                                      ...oh you did");
		}
		
		if(rand==3) {
			JOptionPane.showMessageDialog(null, "you will blink");
		
		}
		
		if(rand==4) {
			JOptionPane.showMessageDialog(null, "you will attempt to guess the number I'm thinking of");
		
		}
	}
	
}
