package Demo11LambdaExpressions;

interface Addition {
	public float add(int x, float y);
}

public class Demo02LambdaExpr {
	public static void main(String[] args) {
		Addition a1 = (a, b) -> {
			return a + b;
		};
		System.out.println(a1.add(1, 5.0f));
	}
}
