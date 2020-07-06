package wrapperclass;
/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */

public class WrapperClassMain {

	public static void main(String[] args) {
		/*
		 *  WrapperClass 객체생성
		 */
		
		//Boxing
		Integer wi1 = null;
		wi1 = new Integer(89);
		Integer wi2 = new Integer("89");
		//UnBoxing
		int i1 = wi1.intValue();
		int i2 = wi2.intValue();
		//Boxing
		Double wd1 = new Double(3.14159);
		Double wd2 = new Double("3.14159");
		//UnBoxing
		System.out.println(wd1.doubleValue());
		System.out.println(wd2.doubleValue());
		//Boxing
		Boolean wb1 = new Boolean(true);
		Boolean wb2 = new Boolean("true");
		//UnBoxing
		System.out.println(wb1.booleanValue());
		System.out.println(wb2.booleanValue());
		
		/*
		 *  auto boxing
		 */
		Integer wi3 = 89;
		Integer wi4 = 89;
		double wd3 = 3.14159;
		double wd4 = 3.14159;
		boolean wb3 = true;
		boolean wb4 = false;
		
		/*
		 *  auto unboxing
		 */
		int i11 = wi1.intValue();
		int i22 = wi2;
		double d11 = wd1;
		double d22 = wd2;
		boolean b11 = wb1;
		boolean b22 = wb2;
		
		System.out.println("*************AUTO BOXING************");
		Integer ia = 89;
		Integer ib = 45;
		Integer ic = 78;
		Integer id = 99;
		Integer ie = 23;
		System.out.println("*************UPCASTING************");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		Object oe = ie;
		System.out.println("*************AUTO BOXING-->UPCASTING************");
		Object ooa = 89;
		Object oob = 45;
		Object ooc = 78;
		Object ood = 99;
		Object ooe = 23;
		
		Object[] scoreArray=new Object[10];
		scoreArray[0] = 89;
		scoreArray[1] = 43;
		scoreArray[2] = 75;
		scoreArray[3] = 11;
		scoreArray[4] = 59;
		scoreArray[5] = 63;
		scoreArray[6] = 55;
		scoreArray[7] = 44;
		scoreArray[8] = 33;
		scoreArray[9] = 22;
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer wi = (Integer)scoreArray[i];
			int tempScore = wi.intValue();
			System.out.print(tempScore+" ");
			*/
			int tempScore = (Integer)scoreArray[i];
			System.out.print(tempScore+" ");
		}
	}

}
