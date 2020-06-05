package Collection;

import java.util.HashMap;

public class DuplicateswithMap {
	
	public static void removeDup(int [] arr,int n)
	{
		HashMap<Integer,  Boolean> mp = new HashMap<>(); 
		
		for (int i = 0; i < arr.length; i++) {
			
			if(mp.get(arr[i])==null)
			{
			
				System.out.print(arr[i]+ " ");
			
			
			}
			
			mp.put(arr[i],true);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[]= {10,101,10,20,20,34,56,56};
		int n=arr.length;
		
		removeDup(arr,n);
		

	}

}
