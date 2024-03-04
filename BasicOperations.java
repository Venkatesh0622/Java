package demosessions;

public class BasicOperations 
{
 void add()
 {
	 int a=10;
	 int b=20;
	 int c=a+b;
	 System.out.println("Addition:"+c);
 }
 void sub()
 {
	 int a=30;
	 int b=20;
	 int c=a-b;
	 System.out.println("Subtraction:"+c);
 }
 void mul()
 {
	 int a=10;
	 int b=5;
	 int c=a*b;
	 System.out.println("Multiplication:"+c);
 }
 void div()
 {
	 int a=60;
	 int b=3;
	 int c=a/b;
	 System.out.println("Division:"+c);
 }
 public static void main(String[] args) 
 {
	 System.out.println("Arithmetic Operations:-");
	 System.out.println("=======================");
	 BasicOperations obj=new BasicOperations();
	 obj.add();
	 obj.sub();
	 obj.mul();
	 obj.div();
	 System.out.println("End");
	
}
}
