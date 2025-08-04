import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C0804_05 {

	public static void main(String[] args) {
		// MAP - Map<key, value>
		Map<String, String> map = new HashMap<String, String>();
		// put - add 명령어
		map.put("aaa","1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		
		Iterator iterator = map.entrySet().iterator();
		
		// value 출력
		System.out.println(map.get("aaa")); 
		
		// key 유무 확인
		if(map.containsKey("bbB")) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		// key & value 둘 다 출력
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
