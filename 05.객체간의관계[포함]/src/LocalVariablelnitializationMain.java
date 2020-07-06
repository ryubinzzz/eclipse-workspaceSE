
public class LocalVariablelnitializationMain {

	public static void main(String[] args) {
	int a = 9;
	int b = 10;
	
	int t = a;
	a = b;
	b = t;
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	int tot;
	/*
	( The local variable tot may not have been initialized )
	tot=tot+1;
	*/
	
	tot=0;
	tot=tot+1;
	
	int a1=a;
	int b1=b;
	
	LocalVariablelnitialization m1=new LocalVariablelnitialization(1, "KIM");
	m1.print();
	LocalVariablelnitialization m2 = null;
	/*
	 * null : 객체주소리터럴
	 *      - 참조변수 초기화의 용도로 사용
	 *      - 주소값이 없다라는 값이다
	 */
	if(m2==null) {
		m2=new LocalVariablelnitialization(2,"LEE");
		m2.print();
	}else {
		m2.print();
	}
	System.out.println("-------------------------------------------------");
	LocalVariablelnitialization m3 = new LocalVariablelnitialization(3,"SAM");
	LocalVariablelnitialization m4 = null;
	m4 = m3;
	m3.print();
	m4.print();
	if(m3==m4) {
		System.out.println("m3와 m4의 주소값이 동일하다.");
	}else {
		System.out.println("m3와 m4의 주소값이 동일하지 않다.");
	}
	LocalVariablelnitialization firstMember = new LocalVariablelnitialization(1111,"FIRST");
			
	LocalVariablelnitialization secondMember = new LocalVariablelnitialization(2222,"SECOND");
	firstMember.print();
	secondMember.print();
	
	LocalVariablelnitialization temMember = firstMember;
	firstMember = secondMember;
	secondMember = temMember;
	
	firstMember.print();
	secondMember.print();
	
	}

}
