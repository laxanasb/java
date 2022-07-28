package Array;

import java.util.ArrayList;
import java.util.Collections;

public class addremoveAll {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("i");
		al.add("q");
		al.add("v");
		al.add("i");
		al.add("a");
		
		ArrayList a = new ArrayList();
		a.add("hi");
		a.addAll(al);
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		
		
		Collections.sort(al);
		System.out.println(al);	}

}
