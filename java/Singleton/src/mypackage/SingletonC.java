/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
package mypackage;

public class SingletonC {
    private static SingletonC singleton = new SingletonC();
    private SingletonC() {}
    public static SingletonC getSignleton(){
        return singleton;
    }
}
