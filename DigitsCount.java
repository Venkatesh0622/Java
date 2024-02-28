package Java;

import java.util.Scanner;

public class DigitsCount 
{
       static public void countDigits(int n)
    {
        int count=0;
        while (n>0) 
        {
           n=n/10;
           count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        
        DigitsCount.countDigits(num);
        sc.close();    
    } 
}
