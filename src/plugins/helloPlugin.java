package plugins;

import java.util.ArrayList;
import java.util.List;

import commands.*;
import boulderSim.*;

public class helloPlugin implements basePlugin{

	protected List<Command> commands;
	protected Speaker spk;
	
	public helloPlugin(Speaker spk){
		this.spk=spk;
		this.commands=new ArrayList<Command>();
		this.commands.add(new kawaiiHandler());
		this.commands.add(new anonymousCommand("!dingus", "poop"));
		this.registerCommands();
	}

	@Override
	public void registerCommands() {
		for(Command c: this.commands){
			spk.registerCommand(c);
		}
	}
}
