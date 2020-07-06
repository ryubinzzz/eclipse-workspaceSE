package com.itwill01.member_method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		
		/*
		 학생객체데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		
		std1.setStudent(1, "RYU", 90, 80, 70, 3);
		std2.setStudent(2, "BIN", 70, 80, 100, 2);
		std3.setStudent(3, "GOD", 100, 100, 100, 1);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		
		std1.tot();
		std2.tot();
		std3.tot();
		
		std1.avg();
		std2.avg();
		std3.avg();
		
		std1.grade();
		std2.grade();
		std3.grade();
		
		
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		System.out.println("-----------------학생 성적출력------------------");
		System.out.printf("%5s %8s %6s %6s %4s %5s %7s %3s %3s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("------------------------------------------------");
		std1.print();
		std2.print();
		std3.print();
		
		

	}

}
