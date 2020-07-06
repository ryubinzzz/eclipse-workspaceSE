package com.itwill03.member;

public class Book {
	
	//책번호
	private int no;
	//책제목
	private String title;
	//책분류
	private String sort;
	//책설명
	private String explanation;
	
	public Book(int no , String title , String sort , String explanation) {
		super();
		this.no = no;
		this.title = title;
		this.sort = sort;
		this.explanation = explanation;
		
	}
	public void point() {
		System.out.println(this.no +"\t"+ this.title +"\t"+ this.sort +"\t"+ this.explanation);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	
	
	
	
	
	
}
