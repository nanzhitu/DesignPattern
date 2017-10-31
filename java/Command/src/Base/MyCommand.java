package Base;

public class MyCommand implements Command{

	private Receiver receiver; 
	private int cmd = 0;
	public MyCommand(int cmd, Receiver receiver) {  
        this.receiver = receiver;  
        this.cmd = cmd;
    }  
	
	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		switch(cmd)
		{
		case ACTION1:
			 receiver.action1();
			 break;
		case ACTION2:
			receiver.action2();
			break;
		default:
			System.out.println("command does not exist!"); 
		}
		
	}

}
