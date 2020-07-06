/**
 * 은행에서 계좌객체를 생성하기 위한 클래스
 * @author 류빈
 * @since 1.2
 * 
 *
 */
public class Account {
	/*
	 * 멤버필드
	 */
	private int no;         //계좌번호
	private String owner;   //계좌주
	private int balance;    //잔고
	private double iyul;    //이율
	
	/*
	 * 멤버메쏘드
	 */
	/*
	 * 입금
	 */
	/**
	 * 입금메쏘드
	 * @param m 입금할돈
	 */
	public void deposit(int m) {
		this.balance=this.balance+m;
	}
	/*
	 * 출금
	 */
	/**
	 * 출금메쏘드
	 * @param m 출금할돈
	 */
	public void withdraw(int m) {
		this.balance =this.balance-m;
	}
	/**
	 * 계좌정보출력
	 */
	public void print() {
		System.out.printf("%d %s %d %.1f %n",this.no,this.owner,this.balance,this.iyul);
	}
	
	/*
	 * 계좌데이타를 set
	 */
	/**
	 * 계좌데이타를 set
	 * @param no 계좌번호
	 * @param owner 계좌주인
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public void setAccountDate(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
		
		
		
		
	}
	/*getter,setter메쏘드*/
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * 잔고반환 메쏘드
	 * @return 잔고
	 */
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	

	
}
