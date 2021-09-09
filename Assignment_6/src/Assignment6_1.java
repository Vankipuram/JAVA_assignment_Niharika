import java.util.TreeMap;
public class Assignment6_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Long,String> map=new TreeMap<Long,String>();
		
		map.put((long) 101, "kavya");
		map.put((long) 110, "suresh");
		map.put((long) 403, "niha");
		
		
		System.out.println("all the keys: "+map.keySet());
		System.out.println("all the values: "+map.values());
		System.out.println("all key-value pairs: "+map.keySet()+map.values());
		System.out.println("descendingMap: "+map.descendingMap());
	}

}
