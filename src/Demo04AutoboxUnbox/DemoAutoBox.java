package Demo04AutoboxUnbox;

public class DemoAutoBox {

	public static void main(String[] args) {
		int a = 10;
		Integer b = a;
		System.out.println(a);
		System.out.println(b);

		Integer c = a;
		System.out.println(c);
		int d = c;
		System.out.println(d);

		char e = 'e';
		Character f = e;
		System.out.println(e);
		System.out.println(f);
	}
}
