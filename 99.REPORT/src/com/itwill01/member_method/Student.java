package com.itwill01.member_method;

public class Student {

	/*
	 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 *  - 캡슐화
	 */
	

		/*
		 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
		 * << 기능 >> 데이타입력,총점계산,평균계산,평점계산, 출력
		 */

		// 멤버변수 선언
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int tot;
		private double avg;
		private char grade;
		private int rank;
		
		// 멤버메쏘드 선언
		public void setStudent(int no,String name,int kor,int eng,int math,int rank) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.rank=rank;
		}
		
		//총점
		public void tot() {
			this.tot = this.kor+this.eng+this.math;
		}
		
		//평균
		public void avg() {
			this.avg = this.tot / 3d;
		}
		
		//평점
		public void grade() {
			switch ((int) (this.avg / 10)) {
			case 10:
				this.grade = 'A';
				break;
			case 9:
				this.grade = 'B';
				break;
			case 8:
				this.grade = 'C';
				break;
			case 7:
				this.grade = 'D';
				break;
			case 6:
				this.grade = 'F';
				break;
			}

		}
		
		//출력
		public void print() {
			System.out.printf("%3d %7s %5d %4d %4d %5d %5.1f %2c %3d\n",this.no,this.name,this.kor,this.eng,this.math,
					this.tot,this.avg,this.grade,this.rank);
			System.out.println();
		}

}
	
