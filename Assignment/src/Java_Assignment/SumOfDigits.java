package Java_Assignment;

import java.util.Scanner;

public class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		int temp=num;
		int d=0;
		while (num>9)
		{
		int res=0;
		while (num>0)
		{
	    d= num%10;
	   res +=d;
		num/=10;
		}
		num=res;
		}
           
    System.out.println(temp+" unit digit of number = "+num);
	 }
}

