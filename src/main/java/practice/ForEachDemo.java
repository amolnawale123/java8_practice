package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		Collections.addAll(str, "£540,000", "£290,000", "£599,950", "£460,000", "£470,000", "£540,000", "£265,000",
				"£1,400,000", "£450,000", "£209,950", "£675,000", "£1,350,000", "£315,000", "£230,000", "£350,000",
				"£410,000", "£270,000", "£240,000", "£799,995", "£225,000", "£635,000", "£265,000", "£420,000",
				"£1,300,000", "£455,000");
		str.forEach(i -> System.out.println(i));
	}

}
