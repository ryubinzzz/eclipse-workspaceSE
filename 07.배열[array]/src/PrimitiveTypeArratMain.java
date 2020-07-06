import java.util.Scanner;

public class PrimitiveTypeArratMain {

	public static void main(String[] args) {
		/*
		 배열:  
		      - 같은데이타형을 가진 기억장소여러개의 모음 
		      - 배열변수의 선언형식
		           데이타타입[] 이름 (식별자) ; 
			  - 사용: 
			       1.배열객체의생성	
				   2.배열객체의 초기화 
		      -특징   
				  1.모든 배열형의 (타입)  변수는 참조변수이다.
				    (배열은 객체다.)
				  2.같은타입만 정의가가능하다 
				  3.길이가 고정되어있다. 
				 
		 */
		
		int pi =34;
		
		
		int[] ia = new int[5];
		ia[0] = 11;
		ia[1] = 22;
		ia[2] = 33;
		ia[3] = 44;
		ia[4] = 55;
		
		System.out.println("-----------------");
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		
		System.out.println("----------for loop-----------");
		System.out.println("배열의크기:"+ia.length);
		for(int i=0;i<ia.length;i++) {
			System.out.println(ia[i]);
		}
		System.out.println("----------------기본형 1차원배열-----------------");
		int[] korArray=new int[10];
		korArray[0]=80;
		korArray[1]=90;
		korArray[2]=70;
		korArray[3]=56;
		korArray[4]=32;
		korArray[5]=99;
		korArray[6]=12;
		korArray[7]=68;
		korArray[8]=18;
		korArray[9]=27;
	
		int korTot=0;
		for (int i = 0; i < korArray.length; i++) {
			korTot+=korArray[i];
		}
		System.out.println("반전체 국어총점");
		System.out.println(korTot);
		System.out.println("국어 반평균:"+korTot / korArray.length);
		
		char[] ca = new char[6];
		ca[0]='H';
		ca[1]='e';
		ca[2]='l';
		ca[3]='l';
		ca[4]='o';
		ca[5]='!';
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		System.out.println("----------------배열객체생성 초기화-----------------");
		int[] scoreArray = {56,77,23,88,92,61,93,43,57,99};
		char[] gradeArray = {'A','B','C','D','A','C','B','F','A','F'};
		boolean[] marriedArray = {true,true,true,true,false,false,false,true,true,true};
		String[] nameArray = {"KIM","LEE","PAPK","CHOI","HONG","KANG","KWON","KUNG","BIN","RYU"};
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.printf
			("%d %c %b %s %n",scoreArray[i],gradeArray[i],marriedArray[i],nameArray[i]);
		}		
		
		int[] ia2;
		int ia3[];
		
		
	}

}
