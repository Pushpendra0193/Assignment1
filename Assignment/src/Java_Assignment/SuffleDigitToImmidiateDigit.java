package Java_Assignment;

import java.util.Scanner;

public class SuffleDigitToImmidiateDigit
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		String str=String.valueOf(num);
		char[] c= str.toCharArray();
		String str1="";
		String str2="";
		for(int i=0;i<c.length;i++)
		{
              if (i%2==0)
              {
                  str1=str1+c[i];   
              }  
			  else
			{
			  str2=str2+c[i]; 
			  }
		}

           char [] c1=str1.toCharArray();
		   char [] c2=str2.toCharArray();
		   String str3="";
		   for(int i=0;i<c.length/2;i++)
		   {
                   str3=str3+c2[i];
		           str3=str3+c1[i];
			 }
		   
		   int res=Integer.parseInt(str3);
		   System.out.println("resut = "+res);
	 }
	
}
