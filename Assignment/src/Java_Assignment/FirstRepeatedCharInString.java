package Java_Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedCharInString 
{
    static char firstRepeatedChar(char str[]) 
    { 
        HashSet<Character> h = new HashSet<>(); 
        
        for (int i=0; i<str.length; i++) 
        { 
            char c = str[i]; 
            
            if (h.contains(c)) 
            {
                return c; 
            }
  
            else 
            {
            	 h.add(c);
            } 
        } 
  
        return '0'; 
    } 
  
    public static void main (String[] args) 
    { 
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter a string  ");
        String str = s.next(); 
        char[] arr = str.toCharArray(); 
        System.out.println(firstRepeatedChar(arr)); 
    } 

}
