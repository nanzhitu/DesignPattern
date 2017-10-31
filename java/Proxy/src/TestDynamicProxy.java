import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import DynamicProxy.DynamicProxy;
import StaticProxy.Source;
import StaticProxy.Sourceable;

public class TestDynamicProxy {
	public static void main(String[] args) {
		 
		//����Ҫ�������ʵ����
		Source source = new Source();
		//����Ҫ�����ĸ���ʵ���󣬾ͽ��ö��󴫽�ȥ�������ͨ������ʵ�����������䷽����
        InvocationHandler handler = new DynamicProxy(source); 
        
        /*
         * ͨ��Proxy��newProxyInstance�������������ǵĴ��������������������������
         * ��һ������ handler.getClass().getClassLoader() ����������ʹ��handler������ClassLoader�������������ǵĴ������
         * �ڶ�������source.getClass().getInterfaces()����������Ϊ��������ṩ�Ľӿ�����ʵ������ʵ�еĽӿڣ���ʾ��Ҫ������Ǹ���ʵ���������Ҿ��ܵ�������ӿ��еķ�����
         * ����������handler�� �������ｫ������������������Ϸ��� InvocationHandler ���������
         */
        Sourceable sourceable = (Sourceable) Proxy.newProxyInstance(handler.getClass().getClassLoader(), source.getClass().getInterfaces(), handler);
        sourceable.method();
	}  
}
