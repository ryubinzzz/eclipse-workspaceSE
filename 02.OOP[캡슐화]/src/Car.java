/*
 * 주차장프로그램에서 차객체를(instance)를 생성하기 위한 클래스
 */
public class Car {
	/* 
	 * << 속성 >>
	 * 멤버변수 (변수)
	 * instance변수
	 */
	
	String no;//차량번호
	int inTime;//입차시간
	int outTime;//출차시간
	int fee;//주차요금
	
	/* 
	 * << 행위 >>
	 * 멤버메쏘드
	 * 인스턴스메쏘드
	 */
	
	//입차
	void ipCha(String no,int intime) {
		this.no=no;
		this.inTime=inTime;
	}
	// 출차시간set
	void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	// 주차요금계산
	void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	
	
	//영수증출력
	void print() {
		System.out.println("-------------------------------------");
		System.out.printf("%8s %6s %8s %12s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-------------------------------------");
		System.out.printf("%8s %6d %8d %10d %n",this.no,this.inTime,this.outTime,this.fee);
	
	
		
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	
	
	
}
