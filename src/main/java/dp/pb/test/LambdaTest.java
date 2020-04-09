package dp.pb.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Lambda表达式和函数式接口
 * 
 * 2.3 方法引用Class::method
 * 
 * @author IT_dp
 *
 */
public class LambdaTest {

	public static class Car {
		public static Car create(final Supplier<Car> supplier) {
			return supplier.get();
		}

		public static void collide(final Car car) {
			System.out.println("Collided " + car.toString());
		}

		public void follow(final Car another) {
			System.out.println("Following the " + another.toString());
		}

		public void repair() {
			System.out.println("Repaired " + this.toString());
		}
	}

	public static void main(String[] args) {
		// final Car car = Car.create(Car::new);
		// List<Car> cars = new ArrayList<>();
		// cars.add(car);
		// cars.add(car);
		// cars.forEach(Car::collide);
		// cars.forEach(e -> {
		// System.out.println(e);
		// });

		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		List<Integer> integers = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			integers.add(i);
		}
		Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		// Optional<String> fullName = Optional.ofNullable(null);
		// System.out.println("Full Name is set? " + fullName.isPresent());
		// System.out.println("Full Name: " + fullName.orElseGet(() ->
		// "[none]"));
		// System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey
		// Stranger!"));
	}
}
