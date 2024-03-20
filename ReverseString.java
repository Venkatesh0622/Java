package Java;

import java.util.Scanner;

public class ReverseString 
{
    public static void reverse(String str)
    {
        char[] arr = str.toCharArray();
 
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i]);   
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        reverse(s);
      
        sc.close();

    }    
}
