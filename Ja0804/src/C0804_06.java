import java.util.ArrayList;

public class C0804_06 {

	public static void main(String[] args) {
		// generic 제너릭 - 특정 <객체>만 받을 수 있음
		ArrayList<Stu> list = new ArrayList<Stu>();
		
		list.add(new Stu("홍길동",100,100,100));
		list.add(new Stu("유관순",90,90,100));
//		list.add(new St(1,"이순신","010-0000-0000"));
		list.add(new Stu("강감찬",70,100,100));
		list.add(new Stu("김구",60,100,100));
		
		// 출력
		for(int i = 0; i < list.size(); i++) {
			// 형변환
			Stu s = (Stu)list.get(i);
			System.out.println(s.getName()+","+s.getKor()); // 주소값 나옴 => 형변환 필요
		}
		
		
	}

}
