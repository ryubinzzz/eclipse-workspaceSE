
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 홀수,짝수,판별
		 */
		int number = 23;
		
		switch (number%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		/*
		 * 4의배수판별
		 */
		int number2=41;
		switch (number2%4) {
		case 0:
			System.out.println(number2+" 는 4의배수");
			break;

		default:
			System.out.println(number2+" 는 4의배수아님");
			break;
		}
		
		/*
		 * 문자비교
		 * A:LEFT
		 * D:RIGHT
		 * W:UP
		 * X:DOWN
		 * S:ROTATE
		 */
		
		char direction='D';
		
		switch (direction) {
		case 'A':
			System.out.println("LEFT로이동");
			break;
		case 'D':
			System.out.println("RIGHT로이동");
			break;
		case 'W':
			System.out.println("UP로이동");
			break;
		case 'X':
			System.out.println("DOWN로이동");
			break;
		case 'S':
			System.out.println("ROTATE로이동");
			break;
			
			
		}
		
		
		
		
		
		
	}

}
