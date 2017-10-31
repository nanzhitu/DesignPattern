import ClassAdapter.Source;
import ClassAdapter.Targetable;
import ObjectAdapter.ObjectWrapper;


public class ObjectAdapterTest {
	public static void main(String[] args) {  
        Source source = new Source();  
        Targetable target = new ObjectWrapper(source);  
        target.method1();  
        target.method2();  
    }  
}
