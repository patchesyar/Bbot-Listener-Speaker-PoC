package commands;

/**
 * A command object is associated with a command trigger string in the speaker hashmap.
 * All commands must have a returnMessage method, and most return a message to be printed  
 * @author John Lavoie
 *
 */
public interface Command {
	/**
	 * core method of a Command. Returns a message (if any) to the speaker to be
	 * sent to System.out
	 * @return a String message to be printed
	 */
	public String returnMessage();
}
