package _0518;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("c:\\");
		File [] files = file.listFiles(); //c:\에 있는 디렉토리와 파일의 리스트 얻기
		
		long bigSize = 0;
		File bigFile = null;
		
		for(int i=0; i<files.length; i++) {
			File f = files[i];
			if(!f.isFile())
				continue;
			
			long size = f.length();
			if(bigSize < size) {
				bigSize = size;
				bigFile = f;
			}
		}
		
		if (bigFile == null)
			System.out.println("파일은 존재 하지 않습니다.");
		else
			System.out.println("가장 큰 파일은 "+bigFile.getPath()+" "+bigSize+"바이트");
	}

}
