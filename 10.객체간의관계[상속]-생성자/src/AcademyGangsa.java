public class AcademyGangsa extends AcademyMember {
	public String subject;//과목
	public AcademyGangsa() {
		// TODO Auto-generated constructor stub
	}
	public AcademyGangsa(int no,String name,String subject) {
		super(no, name);
		this.subject = subject;
	}
	public void Print() {
		super.print();
		System.out.println(subject);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}