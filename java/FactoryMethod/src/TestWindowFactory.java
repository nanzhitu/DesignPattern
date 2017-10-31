/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
import WindowFactory.Window;
import WindowFactory.WindowFactory;

public class TestWindowFactory {


    // The Main function only for our test
    public static void main(String[] args) {
    	WindowFactory myFactory = new WindowFactory();
        Window myBigWindow = myFactory.CreateWindow("Big");
        myBigWindow.func();

        Window mySmallWindow = myFactory.CreateWindow("Small");
        mySmallWindow.func();
        
        
    }
}