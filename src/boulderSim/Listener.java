package boulderSim;

/**
 * Interface for a Listener, listens to a source for command triggers and notifies an associated speaker object
 * @author John Lavoie
 *
 */
public interface Listener {

	/**
	 * Whisper is used to notify the speaker that a command has been triggered  
	 */
	public void whisper(String message);
}
