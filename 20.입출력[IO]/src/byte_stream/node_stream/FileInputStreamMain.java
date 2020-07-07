package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 1. 데이타 source 선정(파일)
 * 2. 입력스트림(InputStream)객체생성(FileInputStream)
 * 3. 입력스트림(InputStream)으로부터 1바이트씩 읽는다(read).
 * 4. 입력스트림을 닫는다(close) 
 * 
 */
public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("fileOut.dat");
		int readByte = fis.read();
		System.out.println("1.byte:"+Integer.toBinaryString(readByte));
		readByte=fis.read();
		System.out.println("2.byte:"+Integer.toBinaryString(readByte));
		while (true) {
			readByte = fis.read();
			if(readByte==-1)break;
			//System.out.println(readByte);
			//System.out.print((char)readByte);
			System.out.print(Integer.toBinaryString(readByte));
			
		}
		fis.close();
	}

}














