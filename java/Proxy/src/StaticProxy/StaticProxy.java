package StaticProxy;

public class StaticProxy implements Sourceable{

	private Source source;
	
	public StaticProxy(Source source){  
        super();  
        this.source = source;  
    }  
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before proxy!"); 
		source.method();
		System.out.println("after proxy!"); 
	}

}
