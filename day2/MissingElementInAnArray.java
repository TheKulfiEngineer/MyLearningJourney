package week1.day2;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int array[] = {6,2,3,4,1,8,9,7};
		int size = array.length;
		System.out.println("The size of the array is : " +size);
		int sum = (((size+1)*(size+2))/2);
		for(int i =0 ;i<array.length; i++)
		{
			sum = sum - array[i];
		}
		System.out.println("The Missing Element in an array is : " +sum);
		
	}

}
