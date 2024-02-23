package practice;
import java.util.*;

public class SumDigits 
{
	static public void sum(int n)
	{
		int sum=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SumDigits.sum(n);
		sc.close();
	}
}
