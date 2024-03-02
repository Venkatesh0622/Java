package Java;

import java.util.Scanner;

public class PairSum 
{
    Scanner sc=new Scanner(System.in);
	
	void  pairSum()
	{
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter the elements into array");
		int []arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Sum Value");
		int sum=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<size;j++)
			{
				
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+","+arr[j]);
					return;
				}
			}
		}
		System.out.println("Pair Not Found");
	}
	
	public static void main(String[] args) 
	{
	   new PairSum().pairSum();
	
    }
  
}
