package week2.day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Calculator obj=new Calculator();
		obj.add(2, 3);
		System.out.println("addition of 2 num "+obj.add(10, 15));
		System.out.println("sub of 2 num "+obj.sub(10.00, 2.00));
		System.out.println("mul of 2 num "+obj.mul(10.00, 25.00));
		System.out.println("div of 2 num "+obj.div(10,2));

	}
	
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public double sub(double a,double b)
	{
		double diff=a-b;
		return diff;
	}
	public double mul(double a,double b)
	{
		double multi=a*b;
		return multi;
	}
	public int div(int a,int b)
	{
		int division=a/b;
		return division;
	}

}
