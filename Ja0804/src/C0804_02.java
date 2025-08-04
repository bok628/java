
public class C0804_02 {

	public static void main(String[] args) {
		// new DescComp()
		

	}
	
	class DescComp implements Comparator{
		@Override
		public int compare(Object o1,Object o2) {
			return (Integer)o2 - (Integer)o1;
			//역순정렬
//			return (Integer)o1 - (Integer)o2;
			
		}
	}

}
