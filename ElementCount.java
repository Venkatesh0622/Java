import java.util.Scanner;

public class ElementCount 
{
    static void occuranceElements(int arr[],int size)
	{
		int count=1;
		for(int i=0;i<size-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i]+"-"+count);
				count=1;
			}
			
		}
		System.out.println(arr[arr.length-1]+"-"+count);
		
	}  
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		occuranceElements(arr, size);
    }  
}
