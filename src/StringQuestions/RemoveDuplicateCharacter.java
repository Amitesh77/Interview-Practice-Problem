package StringQuestions;

import java.util.Arrays;

public class RemoveDuplicateCharacter {
	
	public static String removeChars(String s)
	{
		
		char c[]=s.toCharArray();
		
		int index=0;
		for (int i = 0; i < c.length; i++) {
			
			
			int j;
			for ( j = 0; j < i; j++) {
				
				if(c[i]==c[j])
				{
					break;
				}
			}
			
			if(i==j)
			{
				c[index++]=c[i];
			}
		}
		
		return String.valueOf(Arrays.copyOf(c, index));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=removeChars("amiteshami");
		
		System.out.println(s);

	}

}
