package practice;

import java.util.Arrays;

public class FindMaxNumberInArrayUsingStreams {

	public static void main(String[] args) {

		int[] arr = {1,5,43,23,35,67,87,324,234,543,431};
		
		int maxNum = Arrays.stream(arr).max().getAsInt();
		int minNum = Arrays.stream(arr).min().getAsInt();
		Double average = Arrays.stream(arr).average().getAsDouble();
		System.out.println("The maximum number in the given array is : "+maxNum);
		System.out.println("The minimum number in the given array is : "+minNum);
		System.out.println("The average of the given array is : "+average);
		
	}

}
