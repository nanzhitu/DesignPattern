/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
/**
 *  A Singleton , we can only create one instance
 */
package mypackage;

public class SingletonA  {

    private static SingletonA mInstance = null;// delay create object
    //private SingletonA instance;
    private int i = 0;
    
    // Set constructor private and do nothing
    // Can not new a instance outside class
    private SingletonA() {
    }

    public int getNum() {
        return i;
    }
    
    public void setNum() {
        i++;
    }
    
    public static SingletonA getInstance() {
        if(mInstance == null) {
            synchronized (SingletonA.class)
            {
                if (mInstance == null)
                {
                    mInstance = new SingletonA();
                }
            }
        }
        return mInstance;
    }
    
    public Object readResolve() {  
        return mInstance;  
    }  
    
    public void finalize() {
    	//mInstance = null;
    }
}