
public class ArithmaticOperator {

	public static void main(String[] args) {
       int a=1;
       int b=2;
       char ca='A';
       char cz='Z';
       
       int result;
       /*
        * 1. 산술연산
        */
       result = a+b;
       System.out.println("a+b="+result);
       result = a-b;
       System.out.println("a-b="+result);
       result = a*b;
       System.out.println("a*b="+result);
       result = a/b;
       System.out.println("a/b="+result);
       double dresult = a/b;
       result=a%b;
       System.out.println("a%b="+result);
       int year=2020;
       result = year%4;
       System.out.println("year%4="+result);
       result = year%100;
       System.out.println("year%100="+result);
       result = year%400;
       System.out.println("year%400="+result);
       
       
       System.out.println("------문자연산------");
       result = ca + 1;
       System.out.println("ca+1-->"+result);
       char cb = (char)result;
       System.out.println("cb -->"+cb);
       
       
       char hanFirst = '가';
       char hanLast ='힣';
       
       int letterCount = hanLast-hanFirst+1;
       System.out.println("한글의글자수;"+letterCount);
       
       System.out.println("---비트산술연산---");
       int c = 1;
       /*
        0000000:0000000:0000000:0000001
        0000000:0000000:0000000:0000010
        0000000:0000000:0000000:0000100
        0000000:0000000:0000000:0001000
        */
       
       result = c << 1;
       System.out.println("c<<1-->"+result);
       result = c << 2;
       System.out.println("c<<2-->"+result);
       result = c << 3;
       System.out.println("c<<3-->"+result);
       
       /*
        128 --> 00000000:00000000:00000000:10000000
        64  --> 00000000:00000000:00000000:01000000
        32  --> 00000000:00000000:00000000:00100000
        16  --> 00000000:00000000:00000000:00010000
        8   --> 00000000:00000000:00000000:00001000
        */
       
       int d =128;
       result = d >> 1;
       System.out.println("d>>1-->"+result);
       result = d >> 2;
       System.out.println("d>>2-->"+result);
       result = d >> 3;
       System.out.println("d>>3-->"+result);
       result = d >> 4;
       System.out.println("d>>4-->"+result);
       /*
		비트연산자
		  -형태: | , & ,~

		*/
       int intmax1 = 2147483647;
       int intmax2 = 0B01111111111111111111111111;
       System.out.println(intmax1);
       //System.out.println(intmax2);
       
       int result1 = ~intmax1;
       result1= ~intmax1;
       intmax1=intmax1+1;
       
       
       //int result2 = ~intmax2;
       System.out.println(result1);
       //System.out.println(result2);
       System.out.println(Integer. toBinaryString(result1));
       
       
       
       
       
       
       
       
       /******error messsage******/
       
       
       /*
        * << name cannot be resolved to a variable >>
           name = "류빈";
        */
       /*
        * << Duplicate local variable number >>
        * int number;
        * int number=90; 
        */
       /*
        * << string cannot be resolved to a type >>
        *   string message="오늘은 날씨가 좋아요!!";
        */
      /*
       * Syntax error, insert ";" to complete LocalVariableDeclarationStatement
       *  int score
       *  System.out.println(score);
       */


       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
