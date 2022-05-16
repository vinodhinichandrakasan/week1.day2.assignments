package week2.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array
		Arrays.sort(arr);
		

		// loop through the array (start i from arr[0] till the length of the array)
		
		int len=arr.length;
		
		
		for (int i = 1; i <len; i++) {
			
			
			if(i!=arr[i-1])
			{
				int num=i;
				System.out.println("missing num :"+num);
				break;
			
			}
				
		

	}

}}
