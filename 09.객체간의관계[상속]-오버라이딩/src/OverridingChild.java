
public class OverridingChild extends Overriding{
/*
 * public void method1() {
		System.out.println("Overriding.method1()");
	}
	public void method2() {
		System.out.println("Overriding.method2()");
	}
 */
	public void method2() {
		System.out.println("-----재정의 method2() start-----");
		System.out.println("Overriding.method2()를 OverridingChild 에서 재정의");
		System.out.println(this.toString());
		System.out.println(super.toString());
		super.method2();
		/*
		 * super : this와 같은 self 참조변수
		 * 		- this와 같은주소를 가리킨다
		 * 		- 상속받은 재정의된 은폐된 메쏘드를 호출할때 사용
		 */
		
		/*
		 * 상속받은 method2()는 은폐되고 재정의 된 메쏘드만 호출가능
		 * 
		 */
		System.out.println("-----재정의 method2() end-----");
	}
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
}
