package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> v1 = new ArrayList<String>();
		
		v1.add("1");
		v1.add("2");
		v1.add("3");
		v1.add("4");
		v1.add("5");
		v1.add("6");
		v1.add("7");
		v1.add("8");
		v1.add("9");
		v1.add("10");
		v1.add("11");
		System.out.println(v1);
		System.out.println(v1.size());
		//System.out.println(v1.capacity());
		
		
		for(int i=0;i<v1.size();i++) {
			//System.out.println(v1.get(i));
		}
		
		v1.remove(0);
		System.out.println(v1);
		
		Vector<String> v2 = new Vector<String>();
		v2.add("1");
		v2.add("2");
		
		v1.addAll(v2);
		
		System.out.println(v1);
		
		System.out.println(v1.containsAll(v2));
		
		
		System.out.println(v1.indexOf("3"));
		//System.out.println(v1.firstElement());
		//System.out.println(v1.lastElement());
		
		System.out.println(v1.removeFirst());
		System.out.println(v1.removeLast());
		
		System.out.println(v1);
		
		
		Object[] arr = v1.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
