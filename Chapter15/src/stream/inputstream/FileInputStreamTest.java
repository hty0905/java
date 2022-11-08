package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {

		//FileInputStream fis = null;
		FileReader fis = null;
		int i=0;
		try {
			//fis = new FileInputStream("input.txt");
			fis = new FileReader("input.txt");
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
			//System.out.println((char)fis.read());
			//System.out.println((char)fis.read());
			//System.out.println((char)fis.read());
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		//System.out.println("end");
	}

}
