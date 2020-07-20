package practice;

import java.util.Arrays;

public class RemoveDupElementsFromArraysUsingStreams {

	public static void main(String[] args) {

		int[] arr = {7,1,2,2,6,2,3,4,5,4,6};
		
		//Arrays.stream(arr).distinct().forEach(element -> System.out.print(element + " "));
		Arrays.stream(arr).distinct().forEach(System.out::println);
		
	}

}
