package generics;

public class OrderedPair<K,V> implements Pair<K, V> {
	private K key;
	private V value;

	@Override
	public void getKey() {
		System.out.println(key);
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public void getValue() {
		System.out.println(value);
	}
	
	public static void main(String args[]){
		OrderedPair<Integer, String> op = new OrderedPair<Integer, String>();
		op.setKey(1);
		op.setValue("LOL with key 1");
		op.getKey();
		op.getValue();
	}
	
}
