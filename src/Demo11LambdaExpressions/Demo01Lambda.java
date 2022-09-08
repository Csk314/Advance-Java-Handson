package Demo11LambdaExpressions;

interface Calculation {
	public void calculate();
}

public class Demo01Lambda {
	public static void main(String[] args) {
		int rateOfInterest = 10;
		Calculation c1 = () -> {
			System.out.println("Rate of Interest is: " + rateOfInterest);
		};

		c1.calculate();
	}

}
