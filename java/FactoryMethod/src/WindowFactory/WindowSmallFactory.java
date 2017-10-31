package WindowFactory;

public class WindowSmallFactory implements WindowProvider{

	@Override
	public Window provider() {
		// TODO Auto-generated method stub
		return new WindowSmall();
	}

}
