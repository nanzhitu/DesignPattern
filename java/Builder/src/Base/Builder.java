package Base;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	
	private List<Window> list = new ArrayList<Window>();
	public void produceBigWindow(int count){  
        for(int i=0; i<count; i++){  
            list.add(new WindowBig());  
        }  
    }  
      
    public void produceSmallWindow(int count){  
        for(int i=0; i<count; i++){  
            list.add(new WindowSmall());  
        }  
    } 
    public  List<Window> getWindowList()
    {
    	return list;
    }
}
