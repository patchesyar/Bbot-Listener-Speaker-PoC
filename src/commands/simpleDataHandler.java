package commands;

public class simpleDataHandler implements Command{

	/**
	 * returns a message showing a simple data calculation
	 */
	@Override
	public String returnMessage() {
		// TODO Auto-generated method stub
		return "5+5="+simpleDataCalc();
	}

	/**
	 * Just returns a simple data calculation to prove that state data can
	 * be stored within a command
	 * @return 5+5 like I said, very simple
	 */
	private int simpleDataCalc(){
		return 5+5;
	}
}
