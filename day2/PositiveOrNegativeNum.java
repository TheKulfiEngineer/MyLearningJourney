package week1.day2;
import java.util.Scanner;
public class PositiveOrNegativeNum {
	public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	num = sc.nextInt();
	if(num<0)
	{
		System.out.println("The given number is a Negative Number ");
	}
	else if(num == 0)
	{
		System.out.println("The given number is a neither positive or negative ");
	}
	else
	{
		System.out.println("The given number is a Positive Number ");
	}		
	}
}
