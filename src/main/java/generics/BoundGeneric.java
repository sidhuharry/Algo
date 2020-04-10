package generics;

/**
 * Now that you have generic you might wanna restrict their types..
 * which is called Bounding Generics
 * How to bound
 * use <K extends String>
 * multiple bounds?
 * use<K extends Type1 & Type2 & Type3>
 * 
 * --Type1 must always be a class, followed by Type2, Type3, TypeN interfaces..
 * 
 * <K extends C1 & I1 & I2 & .... In>
 */
public class BoundGeneric {
	
	public static void main(String[] args) {
		Person<Integer, String> harry = new Person<Integer, String>(); // If you change parameter here
		//compiler will throw an error of bound mismatch
		
		harry.setId(1);
		harry.setName("Harry");
	}

}

//Upper bound example
class Person<K extends Integer, V extends String> {
	private K Id; //Key is ID which can only be an Integer
	private V name;//Value is Name which can only be String
	
	public K getId() {
		return Id;
	}
	public void setId(K id) {
		Id = id;
	}
	public V getName() {
		return name;
	}
	public void setName(V name) {
		this.name = name;
	}
	
}
