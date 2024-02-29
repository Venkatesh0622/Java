package practice;


public class Reverse 
{
	/*public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=start;
			arr[start]=arr[end];
			arr[end]=temp;
			start++; 
			end--;
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(+arr[i]+" ");
	}*/
	public static void main(String[] args) 
	{
		int arr[]= {3,4,5,6,2};
		int temp[]=new int[arr.length];
		int k=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(temp[i]+" ");
	}
}
