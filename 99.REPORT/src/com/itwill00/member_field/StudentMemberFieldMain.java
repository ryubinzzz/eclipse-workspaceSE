package com.itwill00.member_field;

import java.io.ObjectInputStream.GetField;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		
		/*
		 학생객체생성(2명)
		 */
		Student st1 = null;
		Student st2 = null;
		Student student1 = new Student();
		Student student2 = new Student();
		
		
		
		/*
		 학생객체데이타(번호,이름,국어,영어,수학)입력(2명)
		 */
		
		student1.id = "1";				
		student1.name = "류빈";		
		student1.kor = 80;				
		student1.eng = 78;				
		student1.math = 95;			
		student1.rank = 0;				
			
		student2.id = "2";				
		student2.name = "김경호";		
		student2.kor = 60;				
		student2.eng = 54;				
		student2.math = 37;				
		student1.rank = 0;				

		
		/*
		 학생총점,평균,평점계산후 멤버변수에 대입
		 */
		
		//류빈
		student1.total = student1.kor + student1.eng+ student1.math;
		student1.avg = student1.total/3f;
		if (st1.avg >= 90 ) {
			st1.grade = 'A';
		} else if (st1.avg >= 80 ) {
			st1.grade = 'B';
		} else if (st1.avg >= 70 ) {
			st1.grade = 'C';
		} else if (st1.avg >= 60 ) {
			st1.grade = 'D';
		} else
			st1.grade = 'E';
		
	
		//김경호
		student2.total = student2.kor+ student2.eng+ student2.math;
		student2.avg = student2.total/3f;
		if (st2.avg >= 90 ) {
			st2.grade = 'A';
		} else if (st2.avg >= 80 ) {
			st2.grade = 'B';
		} else if (st2.avg >= 70 ) {
			st2.grade = 'C';
		} else if (st2.avg >= 60 ) {
			st2.grade = 'D';
		} else
			st2.grade = 'E';
		
		
		
		
		/*
		 * 학생데이타 출력
		 */
		
		System.out.println("---------------학생 성적출력------------------");
		System.out.printf("%5s %6s %5s %6s %5s %5s %5s %5s %6s\n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				           1,"류빈",student1.id, student1.name, student1.kor, student1.eng, student1.math, student1.total, student1.avg, student1.grade, student1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				2,"김경호",student2.id, student2.name, student2.kor, student2.eng, student2.math, student2.total, student2.avg, student2.grade, student2.rank );
		System.out.println("----------------------------------------------");
		
		
		
		
		
		

	}

}
