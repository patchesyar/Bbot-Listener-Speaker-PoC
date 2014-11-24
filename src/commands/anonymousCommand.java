package commands;

/**
 * anonymousCommand is a quick and dirty way to make call/reply commands
 * It's not clean so you should try to avoid it but it's there if you want
 * @author John Lavoie
 *
 */
public class anonymousCommand implements Command{

	private String name;
	private String reply;
	
	
	public anonymousCommand (String call, String reply){
		this.name=call;
		this.reply=reply;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String returnMessage() {
		return reply;
	}

}
