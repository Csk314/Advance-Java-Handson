package Handson_080122;

public class OddEven {
	public static void main(String[] args) {
		String a = "112";

		// ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 3, 411, 22,
		// 31, 29));
		int arr[] = { 2, 3, 411, 22, 31, 39 };
		// ArrayList<Integer> evenList = new ArrayList<Integer>();
		// ArrayList<Integer> oddList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even " + arr[i]);
			} else {
				System.out.println("Odd " + arr[i]);
			}

		}
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) % 2 == 0) {
//				evenList.add(list.get(i));
//			} else {
//				oddList.add(list.get(i));
//			}
//		}
		// System.out.println(evenList);
		// System.out.println(oddList);
	}
}
