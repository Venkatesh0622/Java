import java.util.Scanner;
public class BinaryOrNot 
{
    static void isBinaryOrNot(int number)
    {
        boolean isBinary = true;
        int res = number;
 
        while (res != 0)
        {
            int temp = res%10;  
             if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                res = res/10;    
            }
        }
 
        if (isBinary)
        {
            System.out.println(number+" is a binary number");
        }
        else
        {
            System.out.println(number+" is not a binary number");
        }
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isBinaryOrNot(num);
        sc.close();
    }    
}
