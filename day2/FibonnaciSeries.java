package week1.day2;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int num1 =0 , num2 =1 ,terms = 8;
		System.out.println(num1 +"\n" +num2);
		for(int i =2 ; i<=terms ; i++)
		{
			int temp ;
			temp = num1 +num2;
			num1 =num2;
			num2 = temp;
			System.out.println(temp);
		}
	}

}
