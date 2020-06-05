package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Frequency {
	
	
	public static void countFreq(String s)
	{
		char [] ch=s.toCharArray();
		
		ArrayList<Character> list=new ArrayList();
		
		for (int i = 0; i < ch.length; i++) {
			
			list.add(ch[i]);
		}
		
//		Predicate<Character> count=i->{
//			
//			Collections.frequency(list, i)=1;
//			
//		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
