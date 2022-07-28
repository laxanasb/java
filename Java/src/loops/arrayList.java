package loops;

import java.util.ArrayList;

public class arrayList {

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
		
		
		System.out.println("---retriving array in different ways---");
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("l");
		al.add("a");
		al.add("x");
		al.add("a");
		
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
		}
		
		for(String x:al)
		{
			System.out.println(x);
		}
		
		
		
		
	}

}
 