import Base.Command;
import Base.Invoker;
import Base.MyCommand;
import Base.Receiver;


public class Test {
	
	public static int ACTION1 = 1;
	public static int ACTION2 = 2;
	
	 public static void main(String[] args) {  
	        Receiver receiver = new Receiver();  
	        Command cmd = new MyCommand(ACTION2, receiver);  
	        Invoker invoker = new Invoker();
	        invoker.SetCommand(cmd);
	        invoker.ExecuteCommand();  
	    }  
}
