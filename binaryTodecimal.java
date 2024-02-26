package Java;
import java.util.Scanner;

public class binaryTodecimal 
{
   static void conversion(int num)
   {
        int decimal=0;
        int n=0;
        while(num>0)
        {
            int temp=num%10;
            decimal+=temp*Math.pow(2,n);
            num=num/10;
            n++;
        }
        System.out.println("Decimal Number:-->"+decimal);
   }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        int bin_num=sc.nextInt(); 
        
        binaryTodecimal.conversion(bin_num);
        sc.close();

    }
}
