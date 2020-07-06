package com.itwill.메쏘드;

public class AServiceMain {

	public static void main(String[] args) {
		AService aService = new AService();
		aService.a();
		int no = 90;
		aService.b(no);
		aService.b(890790);
		aService.c(24,"류빈");
		aService.c(42,"빈류");
		aService.d(5,"김경호",'F');
		
		aService.e(1,"BIN",100,90,80);
		aService.e(2,"RYU",80,70,60);
		
		Student st1 = new Student();
		st1.no = 1010;
		st1.name = "RYUBIN";
		st1.kor = 100;
		st1.eng = 90;
		st1.math = 80;
		
		aService.f(st1);
	}

}
