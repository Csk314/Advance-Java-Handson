package Demo13Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo01 {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList(Arrays.asList(20, 40, 40, 50, 60, 71, 77, 88));

		List<Integer> distinctNumber = number.stream().map(i -> i).distinct().collect(Collectors.toList());
		System.out.println("Distinct numbers: " + distinctNumber);

		List<Integer> squareNumbers = distinctNumber.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("Square of Each distinct number: " + squareNumbers);

		List<Integer> evenNumbers = distinctNumber.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNumbers);

		int evenSum = evenNumbers.stream().reduce(0, (ans, i) -> ans + i);
		System.out.println("Sum of Even Numbers: " + evenSum);

		List<Integer> oddNumbers = distinctNumber.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Numbers: " + oddNumbers);

		int oddSum = oddNumbers.stream().reduce(0, (ans, i) -> ans + i);
		System.out.println("Sum of Odd Numbers: " + oddSum);

		int totalSum = distinctNumber.stream().reduce(0, (ans, i) -> ans + i);
		System.out.println("Sum of All numbers: " + totalSum);

		System.out.println("Sum of all nos:" + (oddSum + evenSum));

		List<String> nameList = Arrays.asList("Rakesh", "Ramesh", "Ravi", "Bharath", "jaggu", "Naveen");

		List<String> namesNotStartingWithR = nameList.stream().filter(i -> !i.startsWith("R"))
				.collect(Collectors.toList());
		// System.out.println(namesNotStartingWithR);

		namesNotStartingWithR.forEach(i -> System.out.print(i + " "));

	}
}
