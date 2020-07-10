package com.itwill03.member;

public class BookMember {
		
		//회원번호
		private int no;
		//회원이름
		private String name;
		//전화번호
		private String call;
		//빌린책
		private Book book;
		
		
		public BookMember() {
		}
		
		public BookMember(int no ,String name ,String call ,Book book) {
			super();
			this.no =no;
			this.name =name;
			this.call =call;
			this.book = book;
			
		}
		public void Print() {
			System.out.println("------------책 대여 고객-------------");
			System.out.println("번호\t이름\t전화번호\t책번호\t책이름\t책종류\t설명");
			System.out.println("----------------------------------");
		}
		
		public void print() {
			System.out.println(this.no+"\t"+this.name+"\t"+this.call+"\t"+this.book);
		
		}

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

		public String getCall() {
			return call;
		}

		public void setCall(String call) {
			this.call = call;
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}
		
		
		
		
	
	
	
	
}
