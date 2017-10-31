package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	
	// ���������ʵ��
    Object obj;
    
    public DynamicProxy(Object obj) {
        this.obj = obj;
    }
    
    
    /**
     * ����InvocationHandler�ӿ��е�invoke()����
     * ����Ҫ���ǣ���̬����ģʽ����ʹ�������ڲ��ı�ԭ�����еĴ���ṹ
     * ������£���ԭ���ġ���ʵ������������չ����ǿ�书�ܣ����ҿ��Դﵽ
     * ���Ʊ�����������Ϊ�������before��after�������ǿ��Խ�������
     * �����������չ���ˡ�
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		/*
         * before ��doSomething();
         */
		System.out.println("before dynamic proxy!"); 
		
        Object result = method.invoke(this.obj, args);

        /*
         * after : doSomething();
         */
        System.out.println("after dynamic proxy!"); 
        
        return result;
	}
}
