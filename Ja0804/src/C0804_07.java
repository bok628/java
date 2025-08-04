import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C0804_07 {

	public static void main(String[] args) throws Exception {
		// 파일복사
		File f = new File("C:/aaa/a1.jpg");
		FileInputStream fis = new FileInputStream(f);
		// a2.jpg로 복사
		FileOutputStream fos = new FileOutputStream("C:/bbb/a2.jpg");
		
		while(true) {
			int read = fis.read();
			if(read == -1) break;
			fos.write(read);
		}
		
		fis.close();
		fos.close();
		
		System.out.println("파일 복사 완료");
		
		
		
//		// 문자출력
//		File f = new File("C:/aaa/a1.txt");
//		try {
//			int read = 0;
//			FileInputStream fis = new FileInputStream(f); // 파일 열기
//			while( (read = fis.read() ) != -1) {
//				System.out.print((char)read);
//			}
//			System.out.println();
//			fis.close(); // 파일 닫기
//		} catch(Exception e) { e.printStackTrace(); }
//	
//		
//		System.out.println("프로그램 종료");
	}

}
