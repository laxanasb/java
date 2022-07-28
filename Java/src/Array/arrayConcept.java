package Array;

public class arrayConcept {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--To store diff ele in array--");
		Object a[] = new Object[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = "Hi";
		a[4] = 2.33;
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);

		}

	}
}
