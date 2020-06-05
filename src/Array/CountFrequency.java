package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountFrequency {
	
	public static void count(String s)
	{
		char [] c=s.toCharArray();
		
		ArrayList<Character> list=new ArrayList();
		
		for (int i = 0; i < c.length; i++) {
			
			list.add(c[i]);
		}
		
		
		Set<Character> s2=list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
		
		
		for (Character character : s2) {
			
			
			System.out.println(character);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		count("AmiteshA");

	}

}
