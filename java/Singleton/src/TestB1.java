/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author neo ye
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import mypackage.SingletonA;
import mypackage.SingletonB;


public class TestB1 {
	 public static void main(String[] args) {
	    File file = new File("singleton");
	    ObjectOutputStream oos = null;
	    ObjectInputStream ois = null;
	    try {
	        oos = new ObjectOutputStream(new FileOutputStream(file));
	        SingletonB SingletonB1 = SingletonB.getInstance();
	
	        oos.writeObject(SingletonB1);
	        oos.close();
	        ois = new ObjectInputStream(new FileInputStream(file));
	        SingletonB SingletonB2 = (SingletonB) ois.readObject();
	        System.out.println(SingletonB1 == SingletonB2);//if not readResolve ,it is false
	
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        if (oos != null) {
	            try {
	                oos.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        if (ois != null) {
	            try {
	                ois.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
}
