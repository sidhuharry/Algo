package generics;
/*
 * This class uses more than one generics arguments
 * K V 
 * 
 * K is key, V is Value, T is type, E is element, N is number
 * 
 */
public interface Pair<K,V> {
	//You don't usally put variables in interface..
	public void getKey();
	public void getValue();
}
