package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		
	
		
		FileInputStream fis=new FileInputStream("");
		FileOutputStream fos=new FileOutputStream("");
		
		int count=0;
		while (true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			fos.write(readByte);
			count++;
			if(count%(1024*1024)==0) {
				System.out.println("☆");
			}
			
		}
		System.out.println();
		System.out.println(">>>> FileCopy: "+count+ " bytes..");
		
	}

}
