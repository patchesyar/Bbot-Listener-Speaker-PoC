package boulderSim;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * GUIListener is a Listener object which uses a simple Swing UI to accept
 * input to be communicated to a Speaker to be printed to System.out.
 * @author John Lavoie
 *
 */
public class GUIListener implements Listener{

	/**
	 * The associated Speaker object
	 */
	private Speaker spk;
	
	/**
	 * Whisper sends a command to a Speaker. By convention, all buttons will be valid
	 * commands.
	 */
	@Override
	public void whisper(String command) {
		System.out.println("Whispering spk from GUIListener");
		spk.SendMessage(command);
	}
	
	/**
	 * Constructor for GUIListener. Generates a UI (A very simple JFrame with one button here)
	 * and when you press the button, it sends a whisper to the speaker to send a message
	 * to System.out. 
	 */
	public GUIListener(){
		this.spk=new Speaker();
		JFrame botFrame= new JFrame("Boulderbot PoC");
		LayoutManager botLayout= new BorderLayout();
		botFrame.setLayout(botLayout);
		botFrame.add(new JLabel("Welcome to Boulderbot Listener Proof of concept!"), BorderLayout.NORTH);
		JButton mainButton= new JButton("!kawaii");
		mainButton.setBackground(Color.BLACK);
		mainButton.setForeground(Color.RED);
		mainButton.setFont(new Font("Arial", Font.PLAIN, 40));
		mainButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("!kawaii was pressed");
				whisper("!kawaii");
			}
		});
		botFrame.add(mainButton,BorderLayout.CENTER);
		botFrame.setVisible(true);
		botFrame.setSize(500,500);
		botFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botFrame.setLocationRelativeTo(null);
	}

}
