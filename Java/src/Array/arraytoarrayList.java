package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arraytoarrayList {

	public static void main(String[] args) {
		String arr[]= {"hi","hello","howareyou"};
		ArrayList a = new ArrayList(Arrays.asList(arr));
		System.out.println(a);
		
		
	}

}
