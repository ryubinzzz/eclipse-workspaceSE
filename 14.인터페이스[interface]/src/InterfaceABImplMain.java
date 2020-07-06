
public class InterfaceABImplMain {

	public static void main(String[] args) {
		System.out.println("----------------------InterfaceABImpl-------------------------");
		InterfaceABImpl abImpl = new InterfaceABImpl();
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
		System.out.println("---------------------InterfaceA------------------------");
		InterfaceA ia = abImpl;
		ia.method1();
		ia.method2();
		System.out.println("---------------------InterfaceB------------------------");
		InterFaceB ib = abImpl;
		ib.method3();
		ib.method4();
		System.out.println("---------------------Object------------------------");
		Object o = abImpl;
		/* 참고
		o.method1();
		o.method2();
		o.method3();
		o.method4();
		*/
		System.out.println("-------------------InterfaceA <--> InterFaceB----------------------");
		InterfaceA ia2 = new InterfaceABImpl();
		ia2.method1();
		ia2.method2();
		InterFaceB ib2 = (InterFaceB)ia2;
		ib2.method3();
		ib2.method4();
		
		
		
		
		
		
		
	}

}
