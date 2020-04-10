package generics;

//This class shows how to use generics
//T is for type
public class BoxTheGeneric<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String args[]){
		BoxTheGeneric<String> box = new BoxTheGeneric<String>();
		box.setT("LOL");
		System.out.println(box.getT());
	}
}
