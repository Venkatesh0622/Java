package Java;

import java.util.Scanner;

public class PrimeOrNot 
{
    void checkPrime1(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			 count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
	void checkPrime2(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	String checkPrime3(int n)
	{
		for(int i=2;i*i<n;i++)
		{
			if(n%i==0)
			{
				return "Not Prime";
			}
		}
		return "Prime";
	}
	public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number");
       int num=sc.nextInt();
        new PrimeOrNot().checkPrime1(num);
        sc.close();
    }    
}
