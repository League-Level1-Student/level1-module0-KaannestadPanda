import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
JButton bell=new JButton("bell");
		JButton laugh=new JButton("laugh");
		JButton drum=new JButton("drum");
	public static void main(String[] args) {
		new SoundEffects().gui();
	}
	
	void gui() {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		frame.add(panel);
		
	bell.addActionListener(this);
	laugh.addActionListener(this);
	drum.addActionListener(this);
	panel.add(bell);
	panel.add(laugh);
	panel.add(drum);
	frame.pack();
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bell) {
			playSound("bell.wav");
		}
		else if(e.getSource()==laugh) {
			playSound("laugh.wav");
		}
		else if(e.getSource()==drum) {
			playSound("drumo.wav");
		}
	}
}
