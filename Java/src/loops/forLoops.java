package loops;

public class forLoops {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is multiple of 2");
			}
		}
	}
}
