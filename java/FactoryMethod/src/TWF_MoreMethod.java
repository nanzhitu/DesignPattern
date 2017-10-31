/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
import WindowFactory.Window;
import WindowFactory.WindowFactory;


public class TWF_MoreMethod {
    public static void main(String[] args) {
    	WindowFactory myFactory = new WindowFactory();
        Window myBigWindow = myFactory.CreateWindowBig();
        myBigWindow.func();

        Window mySmallWindow = myFactory.CreateWindowSmall();
        mySmallWindow.func();
        
        System.out.println("以下是最常用的静态工厂方法模式!");
        WindowFactory.ProduceWindowBig().func();
        WindowFactory.ProduceWindowSmall().func();
    }
}
