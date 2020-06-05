package Array;

import java.util.Arrays;

public class RemoveDuplicates {
	
	
	public static int removeDup(int [] arr,int n)
	{
		int j=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
		}
		
		arr[j++]=arr[n-1];
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar= {10,10,10,10,20,20,20,10,30,30 ,50,50};
		Arrays.sort(ar);
		
		int l=removeDup(ar,ar.length);
		
		for (int i = 0; i <l; i++) {
			System.out.print(ar[i]+ " ");
			
		}

	}

}
