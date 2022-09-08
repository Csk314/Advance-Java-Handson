package Demo13Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo02 {
	public static void main(String[] args) {
		List<Country> cntry = new ArrayList<Country>();
		// cntry.add(new Country()); if parameterized constructor is defined we have to
		// explicitly define default constructor also if u need
		cntry.add(new Country("ABW", "Aruba", 78.4f));
		cntry.add(new Country("AFG", "Afghanistan", 45.9f));
		cntry.add(new Country("AGO", "Angola", 38.3f));
		cntry.add(new Country("AIA", "Anguilla", 76.1f));
		cntry.add(new Country("ALB", "Albania", 71.6f));
		cntry.add(new Country("AND", "Andorra", 83.5f));
		cntry.add(new Country("ANT", "Netherlands Antilles", 74.7f));
		cntry.add(new Country("ARE", "United Arab Emirates", 74.1f));
		cntry.add(new Country("ARG", "Argentina", 75.1f));
		cntry.add(new Country("ARM", "Armenia", 66.4f));

		// Getting the lifeexpectancy list which is >=76
		// Normal way
		System.out.println("============Normal Way================");
		List<Float> lifeExplist = new ArrayList<>();
		for (Country c : cntry) {
			if (c.lifeExpectancy >= 76.0f) {
				lifeExplist.add(c.lifeExpectancy);
				System.out.println(c.code + " " + c.name + " " + c.lifeExpectancy);
			}
		}
		System.out.println(lifeExplist);

		// Using Streams
		List<Float> lifeExpStrmlist = cntry.stream().filter(c -> c.lifeExpectancy >= 76.0f).map(c -> c.lifeExpectancy)
				.collect(Collectors.toList());
		System.out.println(lifeExpStrmlist);

		// 1st way
		System.out.println("===============First Way==============");
		cntry.stream().filter(c -> c.lifeExpectancy >= 76.0f).forEach(c -> {
			System.out.println(c.code + " " + c.name + " " + c.lifeExpectancy);
		});

		// 2nd Way
		System.out.println("=============Second Way===================");
		List<Country> lifeExpStrmCntrylist = cntry.stream().filter(c -> c.lifeExpectancy >= 76.0f)
				.collect(Collectors.toList());
		// System.out.println(lifeExpStrmCntrylist);

		for (Country c : lifeExpStrmCntrylist) {
			System.out.println(c.code + " " + c.name + " " + c.lifeExpectancy);
		}

	}
}
