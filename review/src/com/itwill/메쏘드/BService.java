package com.itwill.메쏘드;

public class BService {
	private int member1;
	private int member2;
	private int member3;
	private int member4;
	
	public void a() {
		System.err.println("a()메쏘드 호출");
	}
	
	public int b() {
		System.err.println("public int b()메쏘드 실행후 int 반환");
		int i = 1010;
		return i;
	}
	public String c(String name) {
		System.err.println("public int c(String name)메쏘드 실행후 String 반환");
		String msg = name+"님 안녕하세요";
		return msg;
	}
	
	public Student d(Student st) {
		st.tot = st.kor+st.eng+st.math;
		return st;
	}
	
	public Student e() {
		Student st = new Student();
		st.no = 99999;
		st.name = "구구구";
		st.kor = 99;
		st.eng = 89;
		st.math = 79;
		return st;
		
	}
}
