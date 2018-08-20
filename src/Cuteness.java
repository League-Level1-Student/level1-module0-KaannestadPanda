import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness implements ActionListener {
	JButton duck=new JButton("duck");
	JButton frog=new JButton("KERMIT");
	JButton fluffyunicorns=new JButton("fluff");
	public static void main(String[] args) {
		new Cuteness().gui();
	}
	
	void gui() {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		frame.add(panel);
		
	duck.addActionListener(this);
	frog.addActionListener(this);
	fluffyunicorns.addActionListener(this);
	panel.add(duck);
	panel.add(frog);
	panel.add(fluffyunicorns);
	frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==duck) {
			showDucks();
		}
		else if(e.getSource()==frog) {
			showFrog();
		}
		else if(e.getSource()==fluffyunicorns) {
			showFluffyUnicorns();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
}
