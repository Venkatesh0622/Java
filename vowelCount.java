import java.util.Scanner;

public class vowelCount 
{
    static void counting_vowels(String s)
    {   
		char[] c = s.toCharArray();
		int vowel=0;
		
		for (int i = 0; i < s.length(); i++) 
        { 
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
                vowel++; 
		}
  
	System.out.println("Vowels: " + vowel);
    }
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        counting_vowels(word);
        sc.close();
            
    }    
}
