
public class AccontEncapsulationMain {

	public static void main(String[] args) {
		/*
		Account account1=new Account();
		account1.setAccountDate(1111,"RYU",56000,0.5);
		account1.deposit(3000);
		account1.print();
		*/
		
		Account account2=new Account();
		account2.setAccountDate(2222,"BIN",89000,1);
		account2.withdraw(5600);
		account2.print();
		
		
		int account2Balance=account2.getBalance();
		System.out.println("account2의 잔고조희:"+account2Balance);
		
		account2.setOwner("BIN");
		
		account2.print();
	}
	

}
