package Array;

import java.util.ArrayList;

public class arraylistMethods {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("hi");
		a.add("hello");
		a.add("how are you");
		
		System.out.println("---methods of arrayList---");
		System.out.println(a.get(0));
		a.remove(1);
		System.out.println(a);
		a.set(1, "laxana");
		System.out.println(a);
		System.out.println(a.contains("hi"));
		System.out.println(a.isEmpty());

	}

}
