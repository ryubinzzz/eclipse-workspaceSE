
public class ForNested {

	public static void main(String[] args) {
		/*
		★[i=0,j=0]★[i=0,j=1]★[i=0,j=2]★[i=0,j=3]★[i=0,j=4]
		★[i=1,j=0]★[i=1,j=1]★[i=1,j=2]★[i=1,j=3]★[i=1,j=4]
		★[i=2,j=0]★[i=2,j=1]★[i=2,j=2]★[i=2,j=3]★[i=2,j=4]
		★[i=3,j=0]★[i=3,j=1]★[i=3,j=2]★[i=3,j=3]★[i=3,j=4]
		★[i=4,j=0]★[i=4,j=1]★[i=4,j=2]★[i=4,j=3]★[i=4,j=4]
		 */
		
		
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5;j++) {
			System.out.printf("★[i=%d,j=%d]",i,j);
			}
			System.out.print("\n");
		}
		/*
		  	★★★★★
			★★★★★
			★★★★★
			★★★★★
			★★★★★
		 */
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.println("\n");
		}
		/*
		 	☆★★★★
			★☆★★★
			★★☆★★
			★★★☆★
			★★★★☆
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
				System.out.print("☆");
			}
			System.out.println();
		}
		
	}

}
