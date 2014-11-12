package boulderSim;

/**
 * Boulderbot is the main function of this Proof of Concept
 * It makes a gui listener and a chat listener, both able to trigger commands and
 * whisper them to a speaker object, which prints to stdout.
 * 
 * @author John Lavoie
 *
 */
public class Boulderbot {

	/**
	 * runs the Proof of Concept test
	 * @param args
	 */
	public static void main(String[] args) {
		GUIListener gl=new GUIListener();
		ChatListener cl=new ChatListener();
	}

}
