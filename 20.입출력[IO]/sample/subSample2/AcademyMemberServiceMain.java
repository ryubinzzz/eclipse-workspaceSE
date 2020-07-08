package com.itwill06.service;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService=new AcademyMemberService();
		
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		academyMemberService.findAcademyMemberByNo(1);
		
		System.out.println("2-1.번호 2 번 AcademyMember 객체 참조변수반환해줘");
		academyMemberService.findAcademyMemberByNo(2);
		
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		academyMemberService.findAcademyMemberByName("KIM");
		
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체배열 참조변수반환해줘");
		AcademyMember[] a = academyMemberService.findAcademyMembersByType(0);
		for (int i = 0; i < a.length; i++) {
			a[i].print();
		}
		
		
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체배열 참조변수반환해줘");
		a = academyMemberService.findAcademyMembersByType(2);
		for (int i = 0; i < a.length; i++) {
			a[i].print();
		}
		
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체배열 참조변수반환해줘");
		a = academyMemberService.findAcademyMembersByType(1);
		for (int i = 0; i < a.length; i++) {
			a[i].print();
		}
		
		
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		a = academyMemberService.findByAcademyMembers(0,"자바");
		for (int i = 0; i < a.length; i++) {
			a[i].print();
		}
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		a = academyMemberService.findByAcademyMembers(2,"영업");
		for (int i = 0; i < a.length; i++) {
			a[i].print();
		}
		
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		a = academyMemberService.findByAcademyMembers(1,"자바");
		for (int i = 0; i < a.length; i++) {
			a[i].print();
		}
		
		System.out.println("---------------------------------------------");
		
	}

}
