
public class TtpeCasting {

	public static void main(String[] args) {
		
		
		byte b = (byte)127;
		short s = (short)32767;
		char c = 'A';
		int i = 2147483647;
		long l = 2147483648L;
		//float f = (float)3.14;
		float f = 3.14f;
		double d=3.14;
		
		/*
		 * 자동형변환
		 */
		double dr = b;
		dr=s;
		dr=c;
		dr=i;
		dr=l;
		dr=f;
		
		/*
		 * 강제(명시적)형변환
		 */
		int iresilt =(int) 1;
		System.out.println("long-->int casting :"+iresilt);
		iresilt=(int)f;
		System.out.println("float-->int casting :"+iresilt);
		iresilt=(int)d;
		System.out.println("double-->int casting :"+iresilt);
		
		double dayg = 85.665;
		System.out.println(dayg);
		int iayg =(int)dayg;
		System.out.println(iayg);
		
		/*
		 * 연산시의 형변환
		 *  - 연산항들중에 가장큰타입으로 모든항이 형변환된다.
		 */
		
		double dresuit =23 + 0.1 + 90 + 's';
		
		int tot = 61 + 42 + 81;
		System.out.println("tot:"+tot);
		double ayg = tot/3.0;
		System.out.println("avg:"+ayg);
		
		
		System.out.println("----------연산시의 형변환예외(byte,short)----------");
		byte bb = 90;
		short ss = 89;
		int ii = 78;
		long ll = 90;
		
		long llresult = bb+ss+ii+ll;
		System.out.println("long-->"+llresult);
		
		int ssresult = bb+ss;
		System.out.println("byte,short의연산은 모든항이 int 로형변환후 연산된다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
