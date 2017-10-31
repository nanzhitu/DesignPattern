package WindowFactory;

public class WindowBigFactory implements WindowProvider  {

	@Override
	public Window provider() {
		// TODO Auto-generated method stub
		return new WindowBig();
	}

}
