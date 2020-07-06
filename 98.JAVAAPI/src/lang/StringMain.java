package lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 명시적 생성
		 */
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		boolean isEqual = name1 == name2;
		System.out.println("name1과 name2의 주소값이 동일하지 않다:"+isEqual);
		
		/*
		 * String 객체의 암시적 생성
		 *  - ""을 사용
		 */
		
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바"); 
		if(str1==str2) {
			System.out.println("str1과 str2의 주소가 동일하다.");
		}
		if(str1!=str3) {
			System.out.println("str1과 str3의 주소가 동일하지 않다.");
		}
	}

}
