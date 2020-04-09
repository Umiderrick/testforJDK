package node;

import java.util.HashSet;

public class Ade2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(-1);
        ListNode cur = res;
        int carry = 0;
        while (l1!=null || l2!=null) {
            int n1 = l1!=null ? l1.val : 0;
            int n2 = l2!=null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        if (carry==1) cur.next = new ListNode(1);
        return res.next;
	}
	
	public int lengthOfLongestSubstring(String s) {
		 int res = 0, left = 0, right = 0;
		HashSet<Character> hs =new HashSet<>(); 
		while (right < s.length()) {
            if (!hs.contains(s.charAt(right))) {
            	hs.add(s.charAt(right++));
                res = Math.max(res, hs.size());
            } else {
            	hs.remove(s.charAt(left++));
            }
        }
		return res;
    }
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
}
