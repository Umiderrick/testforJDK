package dp.pb.test;

public class Eggs {

	public int getMinSteps(int eggNum, int floorNum) {
		if (eggNum < 1 || floorNum < 1) {
			return 0;
		}
		// 备忘录，存储eggNum个鸡蛋，floorNum层楼条件下的最优化尝试次数
		int[][] cache = new int[eggNum + 1][floorNum + 1];
		// 把备忘录每个元素初始化成最大的尝试次数
		for (int i = 1; i <= eggNum; i++) {
			for (int j = 1; j <= floorNum; j++)
				cache[i][j] = j;
		}
		for (int n = 2; n <= eggNum; n++) {
			for (int m = 1; m <= floorNum; m++) {
				for (int k = 1; k < m; k++) {
					// 扔鸡蛋的楼层从1到m枚举一遍，如果当前算出的尝试次数小于上一次算出的尝试次数，则取代上一次的尝试次数。
					// 这里可以打印k的值，从而知道第一个鸡蛋是从第几次扔的。
					cache[n][m] = Math.min(cache[n][m], 1 + Math.max(cache[n - 1][k - 1], cache[n][m - k]));
				}
			}
		}

		return cache[eggNum][floorNum];
	}

	public int getMinSteps2(int eggNum, int floorNum) {
		if (eggNum < 1 || floorNum < 1) {
			return 0;
		}
		// 上一层备忘录，存储鸡蛋数量-1的floorNum层楼条件下的最优化尝试次数
		int[] preCache = new int[floorNum + 1];
		// 当前备忘录，存储当前鸡蛋数量的floorNum层楼条件下的最优化尝试次数
		int[] currentCache = new int[floorNum + 1];
		// 把备忘录每个元素初始化成最大的尝试次数
		for (int i = 1; i <= floorNum; i++) {
			currentCache[i] = i;
		}
		for (int n = 2; n <= eggNum; n++) {
			// 当前备忘录拷贝给上一次备忘录，并重新初始化当前备忘录
			preCache = currentCache.clone();
			for (int i = 1; i <= floorNum; i++) {
				currentCache[i] = i;
			}
			for (int m = 1; m <= floorNum; m++) {
				for (int k = 1; k < m; k++) {
					// 扔鸡蛋的楼层从1到m枚举一遍，如果当前算出的尝试次数小于上一次算出的尝试次数，则取代上一次的尝试次数。
					// 这里可以打印k的值，从而知道第一个鸡蛋是从第几次扔的。
					currentCache[m] = Math.min(currentCache[m], 1 + Math.max(preCache[k - 1], currentCache[m - k]));
				}
			}
		}

		return currentCache[floorNum];
	}

	public static void main(String[] args) {
		Eggs e = new Eggs();
		long t1 = System.currentTimeMillis();
		int a = e.getMinSteps(5, 500);
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		long t3 = System.currentTimeMillis();
		int b = e.getMinSteps2(5, 500);
		long t4 = System.currentTimeMillis();
		System.out.println(t4 - t3);
		System.out.println(a == b);
	}
}
