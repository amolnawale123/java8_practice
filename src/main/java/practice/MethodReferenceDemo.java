package practice;

import java.util.function.Function;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		/**
		 * Method Reference to a Static Method
		 */
		// with Lambda function
		Function<String, Integer> lambda = (String s) -> Integer.parseInt(s);
		System.out.println(lambda.apply("123"));

		// with Method Reference.
		Function<String, Integer> reference = Integer::parseInt;
		System.out.println(reference.apply("234"));

		System.out.println();

		/**
		 * Method Reference to a instance method
		 */
		// with Lambda function
		Function<String, String> lambda1 = (String s) -> s.toLowerCase();
		System.out.println(lambda1.apply("JAVA"));

		// with Method Reference
		Function<String, String> reference1 = String::toLowerCase;
		System.out.println(reference1.apply("Selenium"));

		System.out.println();

	}

}
