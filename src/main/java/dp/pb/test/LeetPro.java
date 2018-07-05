/**
 * 
 */
package dp.pb.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengbo
 *
 */
public class LeetPro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = { 3, 3 };
		// for (int i : twoSum(nums, 6)) {
		// System.out.println(i);
		// }

		ListNode ln = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);

		ln.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		System.out.println(ln.val);
		System.out.println(ln.next.val);
		System.out.println(ln.next.next.val);
		System.out.println(ln.next.next.next.val);
		System.out.println(ln.next.next.next.next.val);

		ListNode reverseListNode = ln.reverseListNode(ln);
		System.out.println(reverseListNode.val);
		System.out.println(reverseListNode.next.val);
		System.out.println(reverseListNode.next.next.val);
		System.out.println(reverseListNode.next.next.next.val);
		System.out.println(reverseListNode.next.next.next.next.val);

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int num = target - nums[i];
			if (map.containsKey(num)) {
				result[0] = map.get(num);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		while (l1.next != null) {

		}

		return l2;

	}
}
