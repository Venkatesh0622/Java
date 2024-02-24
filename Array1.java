 package practice;
import java.util.Scanner;
public class Array1 
{
	void min()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter the elements into the Array");
		int arr[]=new int[size];
		int min=arr[0];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Value:"+min);
			
	}
	void max()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter the elements into the Array");
		int arr[]=new int[size];
		int max=arr[0];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Value:"+max);
		
		
	}
	public static void main(String[] args) 
	{
		Array1 aobj=new Array1();
		aobj.min();
		System.out.println("-------------------------");
		aobj.max();
		
	}
}
