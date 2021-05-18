package _0518;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendedTest {

	public static void main(String[] args) throws IOException {
		
		File src = new File("elvis1.txt");
		File dest = new File("elvis2.txt");
		File text = new File("append.txt");
		int c;
		
		FileReader f1 = new FileReader(src);
		FileReader f2 = new FileReader(dest);
		FileWriter fw = new FileWriter(text);
		
		while((c=f1.read()) != -1) {
			fw.write((char)c);
		}
		
		while((c=f2.read()) != -1) {
			fw.write((char)c);
		}
		
		f1.close();
		f2.close();
		fw.close();
	}

}
