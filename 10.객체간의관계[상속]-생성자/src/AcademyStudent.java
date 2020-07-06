public class AcademyStudent extends AcademyMember {
	public String ban;
	public AcademyStudent() {
	}
	public AcademyStudent(int no,String name ,String ban) {
		/*
		  << 상속받은 private member 접근불가능 >>
			this.no=no;
			this.name=name;
		 */
		
		/*
	  	 << 상속받은 public method 접근가능 >>
			this.setNo(no);
			this.setName(name);
		 */
		
		super(no, name);
		this.ban = ban;
	}
	
	public void Print() {
		super.print();
		System.out.println(ban);
	}
	
	
	
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
}
