package _0518;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;


public class FileReaderTest {

	public static void main(String[] args) {
		
		BufferedOutputStream st = new BufferedOutputStream(System.out, 50);
		File f = new File("c:\\windows\\system.ini");
		try {
			FileReader fin = new FileReader(f);
			int c;
			int i=2;
			
			System.out.print("1: ");
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
				
				
				if ((char)c == '\n') {
					System.out.print(i+": ");
					i++;
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
