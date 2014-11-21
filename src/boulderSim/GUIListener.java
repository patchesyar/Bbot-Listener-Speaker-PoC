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
	public GUIListener(Speaker speaker){
		this.spk=speaker;
		JFrame botFrame= new JFrame("Boulderbot PoC");
		LayoutManager botLayout= new BorderLayout();
		botFrame.setLayout(botLayout);
		botFrame.add(new JLabel("Welcome to Boulderbot Listener Proof of concept!"), BorderLayout.NORTH);
		int commandLength=spk.getCallReplies().size();
		LayoutManager centerLayout;
		if(commandLength%2==0){
			centerLayout= new GridLayout(commandLength/2,2);
		}
		else{
			centerLayout= new GridLayout(commandLength,1);
		}
		JPanel buttonPanel= new JPanel();
		buttonPanel.setLayout(centerLayout);
		for(String s: speaker.getCallReplies().keySet()){
			JButton newButton=new JButton(s);
			newButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println(s+" was pressed");
					whisper(s);
				}
			});

			buttonPanel.add(newButton);
		}
		JPanel exitPanel= new JPanel();
		JButton exitButton= new JButton("Exit");
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				botFrame.dispose();
			}
		});
		exitPanel.add(exitButton);
		botFrame.add(exitPanel,BorderLayout.SOUTH);
		botFrame.add(buttonPanel,BorderLayout.CENTER);
		botFrame.setVisible(true);
		botFrame.setSize(500,500);
		botFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botFrame.setLocationRelativeTo(null);
	}

}
