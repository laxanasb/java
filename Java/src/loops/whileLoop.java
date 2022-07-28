package loops;

public class whileLoop {

	public static void main(String[] args) {
		System.out.println("-----------1 to 10----------");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("-----------Reverse Order----------");
		int j = 10;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
		System.out.println("-----------multiple of 2----------");
		int k = 1;
		while (k <= 10) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
			k++;
		}
	}

}
