
package dp.pb.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Car {
	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}

	public static void collide(final Car car) {
		System.out.println("Collided" + car.toString());
	}

	public void follow(final Car another) {
		System.out.println("Following the " + another.toString());
	}

	public void repair() {
		List<String> names = Arrays.asList("a","b","c");
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println("Repaired " + this.toString());
	}
	final Car car = Car.create( Car::new );
	final List< Car > cars = Arrays.asList( car );
}
