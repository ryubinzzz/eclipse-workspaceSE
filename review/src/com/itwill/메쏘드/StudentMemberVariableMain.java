package com.itwill.메쏘드;

public class StudentMemberVariableMain {
		//키워드  //식별자
	public static void main(String[] args) {
		/*
		 *  학생 데이타들 담기
		 */
		int no;
		String name;
		int kor,eng,math,tot;
		char grade;
		
		no = 1;  //정수형리터럴
		name = "BIN";
		kor = 80;
		eng = 90;
		math = 100;
		tot = kor+eng+math;
		grade = 'A';
		
		System.out.println(no);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(tot);
		System.out.println(grade);
		System.out.println("-----------------------------------");
		
		/*
		 * 학생 데이타들 학생객체에 담기
		 */

		Student st1 = new Student();
		st1.no =1;
		st1.name ="BIN";
		st1.kor = 100;
		st1.eng = 90;
		st1.math = 80;
		st1.tot = st1.kor+st1.eng+st1.math;
		st1.grade ='A';
		
		
		System.out.print(st1.no+"\t"+st1.name+"\t"+st1.kor+"\t"+st1.eng+"\t"+st1.math+"\t"+st1.tot+"\t"+st1.grade);
		
		
	}

}
