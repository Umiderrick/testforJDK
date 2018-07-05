package dp.pb.test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tessst {

	public static void main(String args[]) {
		System.out.println(Math.round(11.5));
		List<Integer> list = new LinkedList<Integer>();
		list.add(11);
		list.add(22);
		list.add(23);
		list.add(32);
		list.add(45);// x
		list.add(47);
		list.add(48);// x
		list.add(51);// x
		list.add(52);

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Comparator<Integer> cmp = (a, b) -> {
			return a % 10 - b % 10;
		};

		Predicate<Integer> pred = (a) -> {
			return a % 3 != 0;
		};
		// \r\n \n
		list.stream().filter(pred).sorted(cmp.reversed()).forEach(e -> {
			System.out.print("[" + e + ":" + e % 10 + "]  ");
		});
		System.out.println();
		list.stream().filter(pred).sorted(cmp).forEach(e -> {
			System.out.print("[" + e + ":" + e % 10 + "] ");
		});
		List<Integer> vv = list.parallelStream().map((a) -> {
			return a * a;
		}).filter(pred).sorted(cmp).collect(Collectors.toList());
		// .forEach(e->{System.out.print("["+e
		System.out.println(vv);

		Arrays.asList(1.43, "a", "3", "3").forEach((e) -> {
			System.out.println(e);
		});

	}

}
