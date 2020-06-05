package Array;

public class Sorting {
	
	public static int sorting(int [] arr,int n)
	{
		
		
		for (int i = 0; i < n; i++) {
			
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
		
		return arr[n-2];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar= {2,45,6,7,23,59};	
		int secondlargest=sorting(ar,ar.length);
		
		System.out.println(secondlargest);
		
		

	}

}
