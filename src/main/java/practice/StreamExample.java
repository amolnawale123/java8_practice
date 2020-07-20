package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("David", "Tom", "Johnson", "Avantika", "Brijesh", "Peter", "John");

		// Stream<String> stream = list.stream();
		// stream.forEach(System.out::println);
		// stream.forEach(System.out::println);

		list.stream().forEach(System.out::println);
		// list.stream().forEach(System.out::println);
		System.out.println("****************************************");

		// Using Stream
		// list.stream().filter((String
		// name)->name.length()>5).skip(1).forEach(System.out::println);

		// Using Parallel Stream
		// list.parallelStream().filter((String
		// name)->name.length()>5).skip(1).forEach(System.out::println);

		List<String> names = new ArrayList<String>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		names.add("David");
		names.add("Brijesh");
		names.add("rajesh");
		names.add("nilesh");
		names.add("akshay");
		
		// Selecting first 4 names - limit()
		names.stream().limit(4).forEach(System.out::println);
		
		System.out.println("************************");
		
		// Skipping first 4 names - skip() 
		names.stream().skip(4).forEach(System.out::println);
		
		System.out.println("************************");
		
		// Returns length of each name - map()
		names.stream().map(String::length).forEach(System.out::println);
		
		System.out.println("************************");
		
		// Sorting the names according to the natural order - sorted()
		
		names.stream().sorted().forEach(System.out::println);
		System.out.println("************************");
		
		// Sorting the names according to their length - sorted(Comparator<T> comparator)
		
		names.stream().sorted((String name1,String name2) -> name1.length()-name2.length()).forEach(System.out::println);
		System.out.println("************************");
		
		
		int sum = Arrays.stream(new int[] {7,3,5,8,9,1,4}).reduce(0,(a,b)->a+b);
		System.out.println(sum);
		System.out.println("************************");
		
		OptionalInt sum1 = Arrays.stream(new int[] {7,3,5,8,9,1,4}).reduce((a,b)->a+b);
		System.out.println(sum1);
		System.out.println(sum1.getAsInt());
		System.out.println("************************");
		OptionalInt min = Arrays.stream(new int[] {7,3,5,8,9,1,4}).min();
		System.out.println(min);
		System.out.println(min.getAsInt());
		System.out.println("************************");
		OptionalInt max = Arrays.stream(new int[] {7,3,5,8,9,1,4}).max();
		System.out.println(max);
		System.out.println(max.getAsInt());
		System.out.println("************************");
		OptionalDouble avg = Arrays.stream(new int[] {7,3,5,8,9,1,4}).average();
		System.out.println(avg);
		System.out.println(avg.getAsDouble());
		System.out.println("************************");
	}

}
