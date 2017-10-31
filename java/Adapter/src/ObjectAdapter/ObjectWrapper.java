package ObjectAdapter;

import ClassAdapter.Source;
import ClassAdapter.Targetable;

public class ObjectWrapper  implements Targetable{
	private Source source;
	
	public ObjectWrapper(Source source){  
        super();  
        this.source = source;  
    }  

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!"); 
	} 
}
