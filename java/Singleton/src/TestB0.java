/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
import java.lang.reflect.Constructor;

import mypackage.SingletonA;
import mypackage.SingletonB;

/**
 *  Test for our Singleton registry
 */
public class TestB0  {
    public static void main(String[] args) {
        try {

            SingletonB s1 = SingletonB.getInstance();
            Class<SingletonB> cls = SingletonB.class;
            Constructor<SingletonB> constructor = cls
                    .getDeclaredConstructor(new Class[] {});
            constructor.setAccessible(true);
            SingletonB s2 = constructor.newInstance(new Object[] {});

            System.out.println(s1 == s2);//false
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}