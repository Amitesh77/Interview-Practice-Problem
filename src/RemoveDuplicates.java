
public class RemoveDuplicates {
	
	public static int removeDup(int arr[] ,int n)
	{
		int j=0;
		
		for (int i = 0; i < n-1; i++) {
			
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
		
		int arr[]= {10,101,10,20,20,34,56,56};
		
		
		int n=arr.length;
		
		int len=removeDup(arr,n);
		
		for (int i = 0; i < len; i++) {
			
			System.out.println(arr[i]);
		}

	}

}
