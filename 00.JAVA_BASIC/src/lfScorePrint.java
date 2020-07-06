
public class lfScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을변수선언 - 번호,이름,국어,영어,수학,총점,평균,평점(A,B,C),석차
		 */
		String name1,name2;
		char grade1,grade2;
	    int kor1,kor2,eng1,eng2,math1,math2;
	    int  total1,total2;
	    int rank1,rank2;
	    int no1, no2;
	    double avg1,avg2;
	    
		

		/*
		 * 학생 2명 기본데이타(번호,이름,국어,영어,수학)입력
		 */
	    
	    //김경호
	    no1= '1';
	    name1 = "김경호";
	    kor1 = 42;
	    eng1 = 56;
	    math1 = 78;
	    
	    //김경수
	    no2 = '2';
	    name2 = "김경수";
	     kor2 = 43;
	    eng2 = 53;
	    math2 = 76;
	    
	  
		/*
		 * 국어,영어,수학점수의 유효성체크
		 *  - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요
		 *  - 유효하지않은 데이타가 입력되면 프로그램종료
		 */
		
	    
		


		/*
		 * 학생 2명 기본데이타(번호,이름,국어,영어,수학)를 이용해서 총점,평균,평점 계산후 대입
		 */
	    
	    // 김경호
		total1 =kor1+eng1+math1;
		avg1 =total1/3;
	

		
		// 김경수
		total2 =kor2+eng2+math2;
		avg2 =total2/2;
		
		grade1='A';
		grade2='C';
		
		rank1=1;
		rank2=2;
		
		
		/*
	   	- 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요
           	- 출력포맷
 		- 평균은 소수점이하 2째자리수에서 반올림하세요(casting 활용)[옵션]
		- 석차는 구하지마세요

		---------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   337  34.8  A   3  
		 2   김경수   43   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		
		
		System.out.println("-----------------학생 성적출력------------------");
		System.out.printf("%s %4s %4s %s %s %s %s %s %s \n","학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("------------------------------------------------");
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",no1,name1,kor1,eng1,math1,total1,avg1,grade1,rank1);
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",no2,name2,kor2,eng2,math2,total2,avg2,grade2,rank2);
		System.out.println("------------------------------------------------");		


	}

}
