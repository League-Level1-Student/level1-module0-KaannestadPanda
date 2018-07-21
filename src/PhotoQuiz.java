
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseMotionListener {

	public static void main(String[] args) throws Exception {
		PhotoQuiz p = new PhotoQuiz();
		p.start();
	}

	public void start() throws MalformedURLException {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)

		String HEADShOT = "https://i.ytimg.com/vi/KHjy9XQGI84/maxresdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component comp;
		int score = 0;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(HEADShOT);
		comp.addMouseMotionListener(this);
		// 4. add the image to the quiz window
		quizWindow.add(comp);
		quizWindow.pack();
		String scatter = JOptionPane.showInputDialog("Are you raging at my high skill hacks?");
		if (scatter.equals("no")) {
			System.out.println("INCORRECT");
			score--;
		}
		if (scatter.equals("yes")) {
			System.out.println("CORRECT");
			score++;
		}
		quizWindow.remove(comp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)

		// 10. find another image and create it (might take more than one line of code)
		String DOOM = "https://cdn.shopify.com/s/files/1/1211/8882/products/Doomfist_Web_1024x1024.jpg?v=1501265116";
		Component heh;

		heh = createImage(DOOM);
		heh.addMouseMotionListener(this);
		// 11. add the second image to the quiz window
		quizWindow.add(heh);
		quizWindow.pack();
		// 12. pack the quiz window

		// 13. ask another question
		String gravy = JOptionPane.showInputDialog("How did Karl get this?");
		if (gravy.equals("lol dunno")) {
			System.out.println("INCORRECT");
			score--;
		}
		if (gravy.equals("swag")) {
			System.out.println("CORRECT");
			score++;
		}
		// 14+ check answer, say if correct or incorrect, etc.
JOptionPane.showMessageDialog(null, "Your score is "+score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("aaaaaa");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("aaaaaa");
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
