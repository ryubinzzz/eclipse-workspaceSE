package char_stream;

import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("fileWriter.txt");
		
		fw.write(44457);
		fw.write('김');
		for (int i = 0; i < 65536; i++) {
			fw.write(i);
			if(i%100==0) {
				fw.write('\n');
			}
		}
		fw.write("문자열을 맘대로 쓰세요");
		fw.write("\n");
		fw.write("담배피울때 조심하세요");
		
		
		fw.flush();
		fw.close();
		System.out.println("-----------------fileWriter.txt----------------");
		
	}

}
