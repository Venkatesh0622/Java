package Java;

import java.util.Scanner;

public class SecondLargest 
{
        public static void  secondLargest(int[] input) 
        {
            int firstLargest, secondLargest;
            
            if(input[0] > input[1]) 
            {
                firstLargest = input[0];
                secondLargest = input[1];
            } 
            else 
            {
                firstLargest = input[1];
                secondLargest = input[0];
            }
     
            for (int i = 2; i < input.length; i++) 
            {
                if(input[i] > firstLargest) 
                {
                    secondLargest = firstLargest;
                    firstLargest = input[i];
                } 
                else if (input[i] < firstLargest && input[i] > secondLargest) 
                {
                    secondLargest = input[i];
                }
            }
     
            System.out.println("Second Largest Element in the array is ==> "+secondLargest);
        }
     
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int[]arr={18,45,77,31,07};
            secondLargest(arr);
            sc.close();
        }
}
    
