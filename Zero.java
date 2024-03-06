package practice;
import java.util.*;

public class Zero 
{
	Scanner sc=new Scanner(System.in);
	
	int size=sc.nextInt();
	int[] arr=new int[size];
	int[] output_array=new int[size];
	
	void meth1()
	{
		int j=0;
		for(int i=0;i<size;i++) 
			{
			arr[i]=sc.nextInt();
			if(arr[i]!=0)
			{
				output_array[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(output_array[i]+" ");
		}
				
	}
	void meth2()
	{
		int temp=0;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
    }
	
	public static void main(String[] args) 
	{
		Zero obj=new Zero();
		obj.meth1();
		
		obj.meth2();
	}
}
