/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
package WindowFactory;
public class WindowFactory {
    public Window CreateWindow (String type) {
        if(type.equals("Big")) 
        {
            return new WindowBig();
        } 
        else if(type.equals("Small")) 
        {
            return new WindowSmall();
        } 
        else 
        {
            return new WindowBig();
        }
    }
    
    public Window CreateWindowBig () {
    	return new WindowBig();
    }
    
    public Window CreateWindowSmall () {
    	return new WindowSmall();
    }
    
    public static Window ProduceWindowBig () {
    	return new WindowBig();
    }
    
    public static Window ProduceWindowSmall () {
    	return new WindowSmall();
    }
}