package com.itwill.메쏘드;

public class BServiceMain {

	public static void main(String[] args) {
		BService bService=new BService();
		bService.a();
		int ri=bService.b();
		System.out.println("public int b()메쏘드실행후 반환받은 int 데이타:"+ri);
		String msg = bService.c("류빈");
		System.out.println(">>>"+msg);
		
		msg = bService.c("김경호");
		System.out.println(">>>"+msg);
		
		Student st = new Student();
		st.no = 1;
		st.name = "ONE";
		st.kor = 100;
		st.eng = 20;
		st.math = 70;
		
		System.out.println("인자객체:"+st+"-->"+st.tot);
		Student recvSt = bService.d(st);
		System.out.println("반환객체:"+recvSt+"-->"+recvSt.tot);
		
		Student eSt = bService.e();
		System.out.println("-------------반환Student 객체------------");
		System.out.println(eSt.no);
		System.out.println(eSt.name);
		System.out.println(eSt.kor);
		System.out.println(eSt.eng);
		System.out.println(eSt.math);
	}

}
