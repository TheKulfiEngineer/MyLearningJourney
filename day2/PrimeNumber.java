package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int num =13;
		boolean flag = true;
		for(int i=2 ; i<=num/2;i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}
		}
		
		if ( flag == true) 
		{
			System.out.println("The given number is a primeNumber");
		}
		else
		{
			System.out.println("The given number is not a primeNumber");
		}		
	}
	}
