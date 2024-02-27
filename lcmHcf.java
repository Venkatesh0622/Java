package Java;

import java.util.Scanner;

public class lcmHcf 
{
    public void printLcmHcf(int n1,int n2)
    {
        int temp;
        int lcm;
        int hcf;
        while(n2 != 0){
            temp = n2;
            n2 = n1%n2;
            n1 = temp;
         }
   
         hcf = n1;
         lcm = (n1*2)/hcf;
   
         System.out.println("HCF of input numbers: "+hcf);
         System.out.println("LCM of input numbers: "+lcm);
      
    }
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Number:"); 
    int num1=sc.nextInt();
    System.out.println("Enter First Number:");
    int num2=sc.nextInt();

    lcmHcf obj=new lcmHcf();
    obj.printLcmHcf(num1, num2);

    sc.close();
  }  
}
