package Java;

import java.util.Scanner;

public class DigitsSum 
{
    static public void sumOfDigits(int n)
    {
        int sum=0;
        int rem=0;
        while (n>0) 
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
        System.out.println("Enter Number");
        int num=sc.nextInt();
        
        DigitsSum.sumOfDigits(num);


        sc.close();    
    }
    
}
