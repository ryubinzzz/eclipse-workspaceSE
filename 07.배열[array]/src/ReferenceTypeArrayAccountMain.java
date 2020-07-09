
public class ReferenceTypeArrayAccountMain {

	public static void main(String[] args) {
		
		Account acc1=new Account(1111, "KIM", 56800, 0.3);
		Account[] accounts= {
				acc1,
				new Account(2222, "LEE", 56000, 0.9),
				new Account(3333, "PAR", 12000, 1.9),
				new Account(4444, "CHO", 89000, 4.9),
				new Account(5555, "SIM", 34000, 0.6),
				new Account(6666, "DIM", 77000, 0.1),
				new Account(7777, "YIM", 11000, 0.3),
				new Account(8888, "GIM", 21000, 2.4),
				new Account(9999, "QIM", 99000, 3.3)
		};
		System.out.println("1.은행총계좌수:"+ accounts.length);
		System.out.println("2.은행전체계좌출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("3.은행계좌들 총잔고");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance =totBalance + accounts[i].getBalance();
		}
		System.out.println(">>"+totBalance);
		System.out.println("4.은행계좌들중에서 계좌번호 3333번계좌 한개찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5.은행계좌들중에서 계좌잔고 50000원이상 계좌들 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=50000) {
				accounts[i].print();
			}
		}
		System.out.println("6.은행계좌들중에서 계좌이율 2.0 이상 계좌들 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >= 2.0) {
				accounts[i].print();
			}
		}
		System.out.println("7.6666번계좌 3000원입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				
			}
		}
		System.out.println("8.9999번계좌 3000원 출금[Quiz]");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==9999) {
				accounts[i].print();
				
			}
		}
		System.out.println("9.계좌를 잔고순으로 오름(내림)차순으로 정렬");
		
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("10.계좌를 번호으로 오름차순으로 정렬[Quiz]");
		
		System.out.println("11.5555계좌의 이율을 3.5로 변경");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==5555) {
				accounts[i].print();
				accounts[i].setIyul(3.5);
				accounts[i].print();
				
			}
		}
		System.out.println("11.모든계좌의 잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].deposit(50);
			accounts[i].print();
		}
	}

}













