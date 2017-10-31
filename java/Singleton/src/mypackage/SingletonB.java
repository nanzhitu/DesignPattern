/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
package mypackage;

import java.io.Serializable;

public class SingletonB implements Serializable {
	   private static SingletonB mInstance = null;// delay create object
	    //private SingletonA instance;
	    private int i = 0;
	    
	    // Set constructor private and do nothing
	    // Can not new a instance outside class
	    private SingletonB() {
	    }

	    public int getNum() {
	        return i;
	    }
	    
	    public void setNum() {
	        i++;
	    }
	    
	    public static SingletonB getInstance() {
	        if(mInstance == null) {
	            synchronized (SingletonA.class)
	            {
	                if (mInstance == null)
	                {
	                    mInstance = new SingletonB();
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
