	/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형데이타이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false

		*/
public class logicalOperator {

	public static void main(String[] args) {
		boolean a1=false;
		boolean a2=false;
		boolean a3=true;
		boolean a4=true;
		boolean result;
		
        
		
		/*
		 * Logical OR(논리합)  ||
		 *  - false  || false --> false 
		 */
		result =a1 || a2;
		System.out.println("false||false==>"+result);
		/*
		 * Logical AND(논리곱)  &&
		 *  - true  && false --> true
		 */
		result = a3 && a4;
		System.out.println("true&&true==>"+result);
		System.out.println("------점수의 유효성체크------");
		
		int kor=90;
		int math=78;
		
		boolean isVaildkor =(kor>=0) && (kor<=100) ;
		System.out.println("isValidkor:"+isVaildkor);
		boolean isValidMath =(math>=0) && (math<=100);
		System.out.println("isValidMath:"+isValidMath);
		
		boolean isValidAll = isVaildkor &&  isValidMath;
		System.out.println("모든점수가유효한가요?"+isValidAll);
		
		
		
		System.out.println("------합격여부||||------");
		
		int eng=89;
		int spain=56;
		int chn=90;
		
		boolean pass = false;
		
		pass = (eng>=90)||(spain>=90)||(chn>=90) ;
		System.out.println("합격여부:"+pass);
		
		
		/*
		 * Quiz : 윤년여부판단
		 *    1. 4의배수면윤년
		 *    2. 100의배수는 윤년아님
		 *    3. 400의배수는 윤년 
		 */
		
		boolean isLeapYear=false;
		int year = 2020;
		
		//isLeapYear = && || ..
		System.out.println(year+"의 융년 여부:"+isLeapYear);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
