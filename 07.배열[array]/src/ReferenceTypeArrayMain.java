
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		int pi;
		pi=90;
		
		int[] ia=new int[5];
		
		ia[0]=23;
		ia[1]=23;
		ia[2]=23;
		ia[3]=23;
		ia[4]=23;
		
		Account acc1=new Account(4526, "KIM", 56000, 0.8);
		
		Account[] accArray = new Account[5]; 
		accArray[0]=new Account(1111, "KIM", 89000, 0.6);
		accArray[1]=new Account(2222, "FIM", 45000, 0.3);
		accArray[2]=new Account(3333, "VIM", 71000, 1.6);
		accArray[3]=new Account(4444, "SIM", 62000, 0.8);
		accArray[4]=new Account(5555, "AIM", 99000, 2.6);
		
		Account.headerPrint();
		
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
		
		
				
				
				
				
				
	}

}
