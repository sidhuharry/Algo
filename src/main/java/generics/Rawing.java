package generics;

import java.util.TimeZone;

/**
 * 
 * @author Harvinder Sidhu
 * 
 * if you pass unparameterized object to Generic class type.. This called Raw Types.
 *
 */
public class Rawing<T,U> {
	private T shape; // what kind of shape? for ex: square or rectangle or triangel?
	private U name; // name of that shape

	public T getShape() {
		return shape;
	}

	public void setShape(T shape) {
		this.shape = shape;
	}

	public U getName() {
		return name;
	}

	public void setName(U name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Rawing<String, String> shape1 = new Rawing<String, String>(); // Normal generics
		Rawing<String, String> shape2 = new Rawing(); // This is called unchecked conversion. it will give warning
		Rawing shape3 = new Rawing(); // THIS IS RAW TYPE
		TimeZone tz = TimeZone.getTimeZone("EST");
	}
}
