import WindowFactory.Window;
import WindowFactory.WindowBigFactory;
import WindowFactory.WindowProvider;
import WindowFactory.WindowSmallFactory;




public class TW_AbstractFactory {
	public static void main(String[] args) {
		WindowProvider WPBig = new WindowBigFactory();
		Window wbig = WPBig.provider();
		wbig.func();
		
		WindowProvider WPSmall = new WindowSmallFactory();
		Window wsmall = WPSmall.provider();
		wsmall.func();
	}
}
