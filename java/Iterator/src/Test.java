

import Base.Collection;
import Base.Iterator;
import Base.MyCollection;

public class Test {
	
   public static void main(String[] args) {  
	   Collection collection = new MyCollection();  
       Iterator it = collection.iterator();  
          
       while(it.hasNext())  
           System.out.println(it.next());  
    }  
}
