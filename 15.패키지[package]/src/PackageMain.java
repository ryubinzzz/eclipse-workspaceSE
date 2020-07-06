/*
      package 
      1. 관련있는(업무) 클래스의 모음(패키지)
      2. 패키지의 이름은 계층적으로 큰범위부터작은범위로구성  
      3. 클래스의 완전한이름은 패키지를 포함한이름이다. //
      4. 이름충돌을 피하기위해서 
     ex> package samson.sds.chongmu;
	     public class Chongmu1{
		 
		 }
       
	  4.compile 방법 
			>javac -d . XXX.java  	
*/
public class PackageMain {
	public static void main(String[] args) {
		com.itwill.shop.member.Member m1=
				new com.itwill.shop.member.Member();
		System.out.println(m1);
		com.itwill.shop.member.MemberService memberService=
				new com.itwill.shop.member.MemberService();
		System.out.println(memberService);
		
		com.itwill.shop.admin.Member am1=
				new com.itwill.shop.admin.Member();
		System.out.println(am1);
		
		com.itwill.shop.order.Order order=
				new com.itwill.shop.order.Order();
		System.out.println(order);
		
		com.itwill.shop.ShopService shopService=
				new com.itwill.shop.ShopService();
		System.out.println(shopService);
		
		
	}
}














