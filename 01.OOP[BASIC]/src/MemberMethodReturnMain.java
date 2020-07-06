
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr=new MemberMethodReturn();
			System.out.printf("main1");
			int recvData1 = mmr.method1();
			System.out.printf("recvData1:"+recvData1);
			System.out.printf("main2");
			boolean recvData2 = mmr.isMarried();
			System.out.printf("recvData2:"+recvData2);
			
			int recvData3 = mmr.add(45564, 34234323);
			System.out.println("recvData3:"+recvData3);
			recvData3 = mmr.add(56456, 3);
			System.out.println("recvData3:"+recvData3);
			recvData3 = mmr.add(-6756, -344);
			System.out.println("recvData3:"+recvData3);
			
			
			
		

	}

}
