package generics;
/**
 * Similar to generic classes, scope is limited to methods.
 * Can be class constructor also. static is allowed
 *
 */
public class GenericMethods {
	//A method similar to Util class's compare which compare 
	//two objects based on value and key pair
	public static <K, V> boolean compareThings(Things<K,V> thing1, Things<K,V> thing2) {
		boolean similar = false;
		if(thing1.getKey().equals(thing2.getKey()) && thing1.getValue().equals(thing2.getValue())) {
			similar = true;
		}
		return similar;
	}
	
	public static void main(String args[]) {
		Things<Integer, String> t1 = new Things<Integer, String>();
		Things<Integer, String> t2 = new Things<Integer, String>();
		
		t1.setKey(1);
		t1.setValue("MONICA");
		
		t2.setKey(1);
		t2.setValue("MONICA");
		
		System.out.println(GenericMethods.compareThings(t1, t2));
	}
}

class Things<K,V> {
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
