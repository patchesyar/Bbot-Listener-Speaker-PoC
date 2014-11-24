package commands;

public class kawaiiHandler implements Command{
	public String name;
	public kawaiiHandler(){
		name="!kawaii";
	}
	@Override
	public String returnMessage() {
		return "You're so kawaii!";
	}

	public String getName(){
		return this.name;
	}
}
