package boulderSim;


import java.util.ArrayList;
import java.util.TreeMap;

import commands.*;
import plugins.*;

/**
 * A speaker is an object which focuses on sending requested messages to System.out
 * It is attached to any number of Listener objects which tell the speaker when to
 * send messages and what should be in them
 * @author John Lavoie
 *
 */
public class Speaker {
	
	protected TreeMap<String, Command> callReplies;
	private ArrayList<basePlugin> plugins;
	
	/**
	 * Prints the desired reply to the command parameter
	 * @param command The call, or command trigger.
	 */
	public void SendMessage(String command){
		System.out.println(callReplies.get(command).returnMessage());
	}
	
	/**
	 * Constructor. Right now it simply builds a new hashmap with only one Key Value Pair
	 * to be called. this is purely for a test case
	 */
	public Speaker(){
		this.callReplies=new TreeMap<String, Command>();
		this.plugins=new ArrayList<basePlugin>();
		this.plugins.add(new helloPlugin(this));
		System.out.println("helloPlugin detected");
	}
	
	public void registerCommand(Command c){
		this.callReplies.put(c.getName(), c);
	}
	
	/**
	 * returns the hashmap, mainly so that Listeners can confirm if a command is
	 * valid or not
	 * @return callReplies the HashMap containing the valid Commands and Replies
	 */
	public TreeMap<String, Command> getCallReplies(){
		return this.callReplies;
	}
}
