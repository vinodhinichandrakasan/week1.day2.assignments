package week2.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=153;
		int value=input;
		int sum=0;
		while(input!=0)
		{
			int rem=input%10;
			sum=sum+(rem*rem*rem);
			input=input/10;
			//System.out.println(sum);		
		}
		
		System.out.println(sum);
		if(sum==value)
		{
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
		
	}

}
