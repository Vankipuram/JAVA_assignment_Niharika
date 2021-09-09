import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.List;




public class Assignment5_2 {
	public static void random() {
		Map<Integer,Double> map = new HashMap<Integer, Double>();
		map.put(1, 9.0);
		map.put(2, 8.9);
		map.put(3, 8.5);
		map.put(4, 3.4);
		map.put(5, 56.7);
		map.put(6, 3.84);
		map.put(7, 63.4);
		map.put(8, 33.9);
		map.put(9, 878.4);
		map.put(10,67.4);
		Set<Integer> keySet= map.keySet();
		List<Integer> keyList=new ArrayList<>(keySet);
		int size = keyList.size();
		int randInx = new Random().nextInt(size);
		
		Integer randomKey = keyList.get(randInx);
		Double randomValue = map.get(randomKey);
		System.out.println("Key: "+ randomKey+", value: "+randomValue);
		
		
	}
	
	
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			random();
		}
		
		
	}
	

}
