package com.itwill03.member;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember member1 = new BookMember();
		member1.setNo(1);
		member1.setName("RYU");
				
		BookMember member2 = new BookMember();
		member2.setNo(2);
		member2.setName("BIN");
		
		/*
		 * 책객체생성
		 */
		
		Book book1 = new Book(123, "자바", "공부", "A");
		Book book2 = new Book(456, "바자", "부공", "B");
		
		
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		Book[] books = {book1, book2};
		
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */

	}

}
