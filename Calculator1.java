package week2.day2;

public class Calculator1 {

	        public static void main(String[] args) {
			
	        		Calculator1 obj=new Calculator1();
	        		System.out.println("addition of 3 num "+ obj.add(4, 9, 11));
	        		System.out.println("subraction of 2 num "+ obj.sub(20, 10));
	        		System.out.println("mul of 2 num "+obj.mul(20.0, 10.0));
	        		System.out.println("div of 2 num "+obj.divide(6f,3f));
			}
		// TODO Auto-generated method stub
		
			 public int add(int num1, int num2, int num3)
			 {
				 return num1+num2+num3;
			 }
			 public int sub(int num1, int num2)
			 {
				 return  num1-num2;
			 }
			 
			public double mul(double num1, double num2)
			{
				return num1 * num2;
			}
			public float divide(float num1, float num2)
			{
				return num1 / num2;
	
				}

}
