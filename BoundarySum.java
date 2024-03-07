package practice;

public class BoundarySum 
{
	public static void main(String[] args) 
	{
		int[][]arr= {{1,2,3,4},{2,3,6,1},{4,1,5,3},{2,5,7,1}};
		int i=0;
		int j=0;
		int sum=0;
		for(j=0;j<arr.length;j++)
		{
			sum=sum+arr[i][j];
		}
		
		j=arr.length-1;
		for(i=1;i<arr.length;i++)
		{
			sum=sum+arr[i][j];
		}
		
		
		i=arr.length-1;
		for(j=arr.length-2;j>=0;j--)
		{
			sum=sum+arr[i][j];
		}
	
		
		j=0;
		for(i=arr.length-2;i>0;i--)
		{
			sum=sum+arr[i][j];
		}
		System.out.println(sum);
	}
}
