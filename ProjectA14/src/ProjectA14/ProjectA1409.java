package ProjectA14;

import java.io.File;

public class ProjectA1409 {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트입니다.");
		File[] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("파일 크기: " + f.length());
		}
	}
	
	
	public static void main(String[] args) {
		
		File f1 = new File("c:\\windows\\syste.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() +
				", " + f1.getName());
		
		listDirectory(new File("c:\\temp2"));
		
		
		
		
	}
}
