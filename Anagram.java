package Java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
     public static void isAnagram(String s1, String s2) 
     {
         String result1 = s1.replaceAll("\\s", "");
         String result2 = s2.replaceAll("\\s", "");
 
         boolean output = true;
 
        if(result1.length() != result2.length())
        {
            output = false;
        }
        else
        {
            char[] s1Array = result1.toLowerCase().toCharArray();
            char[] s2Array = result2.toLowerCase().toCharArray();
        
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
 
            output = Arrays.equals(s1Array, s2Array);
        }
    
        if(output)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.nextLine();
        System.out.println("Enter second string");
        String s2=sc.nextLine();
        
        isAnagram(s1, s2);
        sc.close();
    }
 
}  
