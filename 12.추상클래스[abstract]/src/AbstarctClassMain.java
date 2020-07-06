
public class AbstarctClassMain {

	public static void main(String[] args) {
		// Cannot instantiate the type AbstarctClass
		// AbstarctClass ac1 = new AbstarctClass();
		AbstarctClassChild acc1 = new AbstarctClassChild();
		acc1.method1();
		acc1.method2();
		
		AbstractClass ac2 = new AbstarctClassChild();
		ac2.method1();
		ac2.method2();
	}

}
