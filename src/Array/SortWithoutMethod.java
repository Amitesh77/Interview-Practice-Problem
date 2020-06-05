package Array;

public class SortWithoutMethod {
	
	public static void Sort(int [] arr,int n)
	{
		
		for (int i = 0; i < arr.length; i++) {
			
			int j;
			
			for ( j = i+1; j < n; j++) {
				
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					
					arr[i]=arr[j];
					
					arr[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar= {2,45,6,7,23,59};
		
		int n=ar.length;
		
		Sort(ar,n);

	}

}
