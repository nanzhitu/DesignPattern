package Base;

public class Invoker {
	
    private Command command;  
    
    public Invoker(){}
    public Invoker(Command command) {  
        this.command = command;  
    }  
  
    public void SetCommand(Command command)
    {
        this.command = command;
    }
    
    public void ExecuteCommand(){  
        command.Execute();  
    }  
}
