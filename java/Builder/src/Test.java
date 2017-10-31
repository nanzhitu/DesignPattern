import Base.Builder;
import Base.Window;


public class Test {
	
	public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceBigWindow(1);  
        builder.produceSmallWindow(3); 
        builder.produceBigWindow(2);  
        
       for(Window i : builder.getWindowList())
       {
    	   i.func();
       }
    }  
}
