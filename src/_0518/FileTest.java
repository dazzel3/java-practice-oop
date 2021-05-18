package _0518;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("c:\\");
		File [] files = file.listFiles(); //c:\�� �ִ� ���丮�� ������ ����Ʈ ���
		
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
			System.out.println("������ ���� ���� �ʽ��ϴ�.");
		else
			System.out.println("���� ū ������ "+bigFile.getPath()+" "+bigSize+"����Ʈ");
	}

}
