package Java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {
	
	public static LinkedHashMap<String,Integer> mapSort(HashMap<String,Integer> map)
	{
		map.put("Amitesh", 101);
		map.put("Piu", 102);
		map.put("Ravi", 103);
		map.put("Abhi", 104);
		map.put("Saurabh", 105);
		map.put("Sanshay", 106);
		map.put("Rohit", 107);
		
		LinkedHashMap<String,Integer> m=map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
		
		return m;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,Integer> m=new LinkedHashMap();
		System.out.println(MapSorting.mapSort(m));
		
		
		
		
		
		//sorting on key
		
		
								



	}

}
