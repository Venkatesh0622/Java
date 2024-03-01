package practice;
import java.util.Scanner;

public class BinarySearch 
{
			
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter size of Array");
				int size=sc.nextInt();
				int arr[]=new int[size];
				System.out.println("Enter Elements into an Array");
				for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}
				System.out.println("-------");
				int start=0;
				int end=arr.length-1;
						
				System.out.println("Enter Searching Element");
				int target=sc.nextInt();
				while(start<=end)
				{
					int mid=(start+end)/2;
					if(arr[mid]==target)
					{
						System.out.println("Element Found");
						return;
					}
					if(arr[mid]<target)
					{
						start=mid+1;
					}
					else
					{
						end=mid-1;
					}
				}
			
				System.out.println("Element not Found");	
				
			}
			

	}
