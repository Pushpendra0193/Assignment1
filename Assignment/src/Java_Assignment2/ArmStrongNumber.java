//Find out all Armstrong numbers between 2 given numbers?
package Java_Assignment2;

class ArmStrongNumber 
{

	public static int power(int n,int p)
	{
	int pow=1;
	for (int i=1;i<=p ;i++ )
	{
		pow*=n;
	}
    return pow;
	}
	public static int digit(int n)
	{
		int count=0;
	while (n>0)
	{
		n=n/10;
           count++;
	}
	return count ;
	}
	public static void main(String[] args) 
	{
		for (int i = 1; i <100; i++) 
		{
			int num = i;
			int temp=num;
			int d;
			int sum=0;
			while (temp>0)
			{
				d=temp%10;
				sum+=power(d,digit(num));
				temp=temp/10;
			}
			if (num==sum)
			{
				System.out.println(num+" is armstrong num");
			}
	
		}
		
	}
}
