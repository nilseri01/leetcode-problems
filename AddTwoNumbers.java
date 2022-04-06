// https://leetcode.com/problems/add-two-numbers/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int sum = (num1 + num2) + carry;
            
            current.next = new ListNode(sum % 10);
            current = current.next;
                
            carry = sum / 10;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        };
        
        if (carry != 0) {
            current.next = new ListNode(carry);
        }
        
        return head.next;
    }
}
