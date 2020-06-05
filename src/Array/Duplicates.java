package Array;

public class Duplicates {
	
	
	public static int remDup(int [] arr,int n)
	{
		int  index=0;
		for (int i = 0; i <n-1; i++) {
			
			if(arr[i]!=arr[i+1])
			{
				arr[index++]=arr[i];
			}
		}
		
		arr[index++]=arr[n-1];
		
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] ={10,10,10,10};
		
		int len=remDup(arr,arr.length);
		
		
		
		for (int i = 0; i <len; i++) {
			
			System.out.println(arr[i]);
		}
				

	}

}
