package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Wild card in generics..
 * If you write something like <? extends Number> ***THIS IS CALLED UPPERBOUND WILDCARD***
 * that means "?" can be anything with Upperbound of Number class.
 * @author ah0661942
 *
 */

public class WildCard {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(25);
		
		List<Float> flist = new ArrayList<Float>();
		flist.add(new Float(232));
		flist.add(new Float(234.43));
		
		show(list);
		show(flist);
		
	}
	
	//Here you can pass any bloody thing which extends number class..
	public static void show(List<? extends Number> list) {
		//If you write it like 
		// <? super Integer> this is called Lower bound.
		// list object can take any values which can take Integer for ex Number or Objects
		for(Number n : list) {
			System.out.println(n.toString());
		}
	}

}
