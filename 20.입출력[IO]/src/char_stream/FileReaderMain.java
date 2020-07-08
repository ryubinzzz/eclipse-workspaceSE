package char_stream;

import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("fileWriter.txt");
		int readChar = fr.read();
		System.out.println("1.readChar:"+(char)readChar);
		readChar = fr.read();
		System.out.println("2.readChar:"+(char)readChar);
		int lineCount=0;
		while (true) {
			readChar = fr.read();
			if(readChar==-1)break;
			System.out.print(lineCount +":"+ (char)readChar);
			if(readChar=='\n') {
				lineCount++;
			}
		}
		fr.close();
		System.out.println();
		System.out.println("----FileReader.read "+lineCount+" 라인읽음----");
	}

}
