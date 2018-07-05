package dp.pb.test;

public class Mt {
	public static final String A = "ab";

	public static final String B = "cd";

	public static final String C;

	public static final String D;

	static {

		C = "ab";

		D = "cd";

	}

	public static void main(String args[]) {
		String t = "abcd";// 指向池
		String s1 = "ab";// 指向池
		String s2 = "cd";// 指向池
		String s = s1 + s2;// 指向堆
		System.out.println(s == t);// false
		String ss = "ab" + s2;// 指向堆
		System.out.println(ss == t);// false
		String sss = "ab" + "cd";// 指向池
		System.out.println(sss == t);// true
		String ssss = A + B;// 指向池
		System.out.println(ssss == t);// true
		System.out.println((C + D) == t);// false
	}
}
