/*
  관계(비교)연산
 	- 형태:> . < . >= . <= . == . !=
 	-관게연산의 결과값은 논리형 데이타이다 (true, false)
 */
public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a > b;
		System.out.println("10>20-->"+result);
		result = a < b;
		System.out.println("10<20-->"+result);
		result = a >= b;
		System.out.println("10>=20-->"+result);
		result = a <= b;
		System.out.println("10<=20-->"+result);
		result = a == b;
		System.out.println("10==20-->"+result);
		result = a != b;
		System.out.println("10!=20-->"+result);
		char c1='가';
		char c2='R';
		
		char c3='A';
		char c4='B';
		result = c1 < c2;
		
		

	}

}
