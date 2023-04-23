package week1.day1;
public class Mobile {
	protected void makeACall(String s , float weight) {
		String mobileModel = s;
		float mobileWeight = weight; 
		System.out.println("The mobile model is : " +mobileModel);
		System.out.println("Te mobile weight is : " +mobileWeight);
	}
	public void sendSms(boolean a , int b) {
		boolean isFullyCharged = a;
		int mobileCost =b;
		System.out.println("Is the mobile fully charged : " +isFullyCharged);
		System.out.println("The cost of the mobile : " +mobileCost);
	}
	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile action = new Mobile();
		action.sendSms(true , 28000);
		action.makeACall("Apple 13 pro" , 197.5f);
	}
}
