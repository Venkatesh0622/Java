package Java;

import java.util.Scanner;

public class Factors 
{
	void printFactors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	void factorsCount(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println("Factors Count:"+count);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Factors obj=new Factors();
		obj.printFactors(num);
		System.out.println("--------------");
		obj.factorsCount(num);
		sc.close();
	}
}
