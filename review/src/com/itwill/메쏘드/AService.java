package com.itwill.메쏘드;

public class AService {
	private int meeber1;
	private int meeber2;
	private int meeber3;
	private int meeber4;
	
	public void a() {
		System.err.println("a() 메쏘드실행");
	}
	public void b(int no) {
		System.err.println("b(int no) 메쏘드실행:인자데이타"+no);	
		
	}
	public void c(int no, String name) {
		System.err.println("c(int no, String name) 메쏘드실행 인자데이타:"+no+","+name);
	
		
	}
	public void d(int no, String name, char grade) {
		System.err.println("d(int no, String name, char grade) 메쏘드실행:"+no+","+name+","+grade);	
	}
	public void e(int no, String name, int kor, int eng, int math) {
		System.err.println("e(int no, String name, int kor, int eng, int math)메쏘드실행:"+no+","+name+","+kor+","+eng+","+math);
		
	}
	public void f(Student student) {
		System.err.println("f(Student student) 인자:"+student);
		System.err.println(student.no);
		System.err.println(student.name);
		System.err.println(student.kor);
		System.err.println(student.eng);
		System.err.println(student.math);
	}
	
}
