import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingObserverExample {
	
	JFrame jframe;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		// TODO Auto-generated method stub
		jframe = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		jframe.getContentPane().add(BorderLayout.CENTER, button);
	}
}
