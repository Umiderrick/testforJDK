package ByteS;

public class Solo {
	public static int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;

	}

	public static int findZero(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) != 1)
				count++;
			n >>>= 1;
		}
		return count;
	}

	public static void main(String[] args) {

		int number = 10;
		// 原始数二进制
//		System.out.println(number);
//		number = number << 1;
//		// 左移一位
//		System.out.println(number);
//		number = number >> 1;
//		System.out.println(number);
//		number >>>= 2;
//
//		// 右移一位
//		System.out.println(number);
		System.out.println(NumberOf1(7));
		System.out.println(findZero(11));
	}
}
