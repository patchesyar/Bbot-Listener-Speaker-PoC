package commands;

public class streamHandler implements Command {

	public String name= "!stream";
	@Override
	public String returnMessage() {
		return "You can watch Rays stream at twitch.tv/raysfire";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
