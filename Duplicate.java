package practice;

public class Duplicate 
{
	public static void main(String[] args) 
	{
		int []arr= {2,5,4,5,3};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]);
			
				}
			}
		}
	}
}
