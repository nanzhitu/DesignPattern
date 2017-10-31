import StaticProxy.Source;
import StaticProxy.Sourceable;
import StaticProxy.StaticProxy;


public class TestStatisProxy {
	
	 public static void main(String[] args) {
		 
		 	Source source = new Source();
	        Sourceable sourceable = new StaticProxy(source);  
	        sourceable.method();  
	    }  
}
