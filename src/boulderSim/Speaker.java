package boulderSim;

import java.util.HashMap;

/**
 * A speaker is an object which focuses on sending requested messages to System.out
 * It is attached to any number of Listener objects which tell the speaker when to
 * send messages and what should be in them
 * @author John Lavoie
 *
 */
public class Speaker {
	
	private HashMap<String, String> callReplies;
	
	/**
	 * Prints the desired reply to the command parameter
	 * @param command The call, or command trigger.
	 */
	public void SendMessage(String command){
		System.out.println(callReplies.get(command));
	}
	
	/**
	 * Constructor. Right now it simply builds a new hashmap with only one Key Value Pair
	 * to be called. this is purely for a test case
	 */
	public Speaker(){
		this.callReplies=new HashMap<String, String>();
		this.callReplies.put("!kawaii", "You're so kawaii!");
	}
	
	/**
	 * returns the hashmap, mainly so that Listeners can confirm if a command is
	 * valid or not
	 * @return callReplies the HashMap containing the valid Commands and Replies
	 */
	public HashMap<String, String> getCallReplies(){
		return this.callReplies;
	}
}
