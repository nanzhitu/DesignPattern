import Base.Observer1;
import Base.Observer2;
import Base.Subject;


public class Test {
	
	public static void main(String[] args) {  
		
        Subject sub = new MySubject();  
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        
        sub.add(observer1);  
        sub.add(observer2);  
          
        sub.operation(); 
        
        
        System.out.println("Now del some member!");
        sub.del(observer1);
        
        sub.operation(); 
        
    }  
}
