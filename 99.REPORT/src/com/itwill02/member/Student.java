package com.itwill02.member;

public class Student {
	/*
	 * << 멤버변수선언 >>
	 */
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;
	/*
	 * <<생성자메쏘드 선언[오버로딩]>>
	 *  - 인자 0개짜리 생성자(기본생성자선언) 
	 *  - 인자 5개짜리(번호 이름 국어 영어 수학) 생성자선언
	 */
	
	/*
	 * <<멤버메쏘드선언 >>
	 */

	public void setStudentData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void calculateTotal() {
		this.tot = this.kor + this.eng + this.math;
	}

	public void calculateAvg() {

		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
	}

	public char calculateGrade() {

		if (this.avg >= 90)
			this.grade = 'A';
		else if (this.avg < 90 && this.avg >= 80)
			this.grade = 'B';
		else if (this.avg < 80 && this.avg >= 70)
			this.grade = 'C';
		else if (this.avg < 70 && this.avg >= 60)
			this.grade = 'D';
		else
			this.grade = 'F';

		return grade;
	}

	public void headerPrint() {
		System.out.println("--------------------------학생 성적출력-----------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점\t석차");
		System.out.println("--------------------------------------------------------------------");
	}

	public void print() {

		System.out.println(no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg + "\t"
				+ grade + "\t" + rank);
	}
	/*
	 * << getter, setter메쏘드선언>>
	 */
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setkor(int kor) {
		this.kor = kor;
	}
	
	
	
	
	
	
	
	
	
	
	
}
