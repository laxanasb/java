package Array;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		
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
