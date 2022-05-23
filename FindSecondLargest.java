package week2.day2;


import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		int len=data.length;
		
		Arrays.sort(data);
		
		for (int i = 0; i < data.length; i++) {
			
			System.out.println(data[i]);
			//System.out.println(data[len-2]);
			
		}

		System.out.println("second largest num"+data[len-2]);
		
		
	}

	
}