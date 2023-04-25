package week1.day2;

public class NegToPosNum {
	public static void main(String[] args) {
	int negativenum = -40;
	int positivenum;
	if(negativenum<0)
	{
		positivenum =~(negativenum-1);
		System.out.println("The number " +negativenum +" is converted to " +positivenum);
	}
	else
	{
		System.out.println("The given number is already positive ");
	}
}}
