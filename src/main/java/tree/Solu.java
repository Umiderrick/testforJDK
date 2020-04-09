package tree;

public class Solu {

	public int TreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);

		return left >= right ? left + 1 : right + 1;
	}

	public static  int Sum_Solution(int n) {
		if (n == 1||n == 0) {
			return n;
		}else{
			return n+Sum_Solution(n-1);
		}
	}

	public static String replaceSpace(StringBuffer str) {
		int q = str.length();
		int sp = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sp++;
			}
		}
		int nq = 2 * sp + q;
		char[] cc = new char[nq];
		int skip = 0;
		for (int i = 0; i < q; i++) {
			if (str.charAt(i) == ' ') {
				cc[i + 2 * skip] = '%';
				cc[i + 2 * skip + 1] = '2';
				cc[i + 2 * skip + 2] = '0';
				skip++;
			} else {
				cc[i + 2 * skip] = str.charAt(i);
			}
		}
		return new String(cc);
	}

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}
}
