
public class OuterClass {
	private InnerClass ic;
	public OuterClass() {
	}
	public int outer_member_field;
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	/*****외부클래스에서 내부클래스사용*****/
	public void outer_inner_use() {
		/*
		 * InnerClass 객체생성
		 */
		InnerClass innerObject=new InnerClass();
		this.ic=innerObject;
	}
	
	/****Nested Class[Inner Class]****/
	public class InnerClass{
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/*
		 *  InnerClass의 사용이유
		 *  	- 내부클래스(객체)에서 외부클래스(객체)의 
		 *  	  멤버의 접근을 손쉽게 하기위해 사용
		 */
		
		public void inner_outer_access() {
			/*
			OuterClass.this.outer_member_field = 758973;
			OuterClass.this.outer_member_method();
			*/
			outer_member_field = 758973;
			outer_member_method();
		}
	}
	
}
