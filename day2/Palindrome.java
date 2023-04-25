package week1.day2;
public class Palindrome {
	public static void main(String[] args) {
		int orginalnum = 34343 ,rem, temp ;
		int num = orginalnum;
        for(temp = 0 ; num>0 ; num/=10)
        {
        	rem = num%10;
        	temp = temp*10 +rem;
        }
		if(temp == orginalnum)
		{
			System.out.println("The given number is a plaindrome .");
		}
		else
		{
			System.out.println("The given number is a not a plaindrome .");
		}
	}
}
