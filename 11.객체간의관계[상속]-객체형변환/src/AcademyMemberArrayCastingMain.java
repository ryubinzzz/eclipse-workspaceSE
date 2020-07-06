public class AcademyMemberArrayCastingMain {

	public static void main(String[] args) {
		
		AcademyMember[] members= {
			new AcademyStudent(1, "KIM", "JAVA"),
			new AcademyStudent(2, "LIM", "KAVA"),
			new AcademyStudent(3, "MIM", "LAVA"),
			new AcademyGangsa(4, "FIM", "C"),	
			new AcademyGangsa(5, "FIM", "C++"),
			new AcademyStaff(6, "KANG", "MARKETING"),
			new AcademyStaff(7, "KING", "CEO")
		};
		
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		/*
		  instanceof
		    - 형태 : 참조변수 instanceof 클래스이름
		    - 반환 : true or false 반환
		    
		 */
		AcademyMember am = new AcademyStudent();
		boolean isStudentInstance = am instanceof AcademyStudent; 
		System.out.println(">> isStudentInstance:"+isStudentInstance);
		System.out.println("------ 학생만출력 -----");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
				AcademyStudent tempStudent =(AcademyStudent)members[i];
				String ban=tempStudent.getBan();
				System.out.println(">>>ban:"+ban);
			}
		}
		

	}

}
