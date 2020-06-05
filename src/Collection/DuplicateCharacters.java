package Collection;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {
	
	public static void findDuplicateCharacters(String s)
	{
		
		char[] ch=s.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap();
		
		for (char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			
			else
			{
				map.put(c, 1);
			}
		}
		
		
		
		Set<Character> set=map.keySet();
		
		for (Character character : set) {
			
			if(map.get(character)==1)
			{
			
			System.out.println(character  +" : " +map.get(character));
			
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicateCharacters("myname is amitesh and i am from patna");

	}

}
