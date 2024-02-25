package practice;
import java.util.Scanner;

public class ArraySum 
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println(sum);
		sc.close();
	}
	public static void main(String[] args) 
	{
		ArraySum obj=new ArraySum();
		obj.meth1();
	}
}
