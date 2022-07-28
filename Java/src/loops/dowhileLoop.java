package loops;

public class dowhileLoop {

	public static void main(String[] args) {
		System.out.println("-----------statemnt execute atleast once----------");
		do
		{
			System.out.println("hi");
			
		}while (false);
		System.out.println("hii hello");
		
		System.out.println("-----------1 to 10----------");
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		System.out.println("-----------revrse order----------");
		int j = 10;
		do {
			System.out.println(j);
			j--;
		} while (j >= 1);
		

	}

}
