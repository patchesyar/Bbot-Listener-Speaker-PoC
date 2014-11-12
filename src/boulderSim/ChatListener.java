package boulderSim;

import java.util.Scanner;

/**
 * ChatListener is a Listener object that simulates reading messages from irc
 * by waiting for input from stdin, and if it is a valid command, sends it to
 * a speaker, where it is then printed to stdout (to simulate sending a reply irc message) 
 * @author John Lavoie
 *
 */
public class ChatListener implements Listener{

	/**
	 * A speaker object, able to send messages to console (IRC)
	 */
	private Speaker spk;
	/**
	 * KILL_COMMAND is a command that ends the input loop, ending the ability
	 * to send messages from stdio
	 */
	private static final String KILL_COMMAND= "!kill";
	
	/**
	 * whisper sends a message to the speaker object. By convention, this message
	 * must be a valid key (call) with a valid value (reply) in the HashMap in spk
	 * @param command the command that is requested to call, must be a valid key
	 */
	@Override
	public void whisper(String command) {
		System.out.println("whispering to spk from Chat");
		spk.SendMessage(command);		
	}

	/**
	 * Constructs and runs a ChatListener. Chat listener runs by reading from System.in
	 * and parses it. If it is a valid command key, it whispers the command
	 * to the speaker to be sent to System.out. If the input is the Kill Command,
	 * The ChatListener terminates functionality. 
	 */
	public ChatListener(){
		this.spk=new Speaker();
		//We are only using one arbitrary command for the proof of concept
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		while(!input.equals(KILL_COMMAND)){
			if(spk.getCallReplies().containsKey(input)){
				whisper(input);
			}
			input=sc.next();
		}
		sc.close();
	}
}
