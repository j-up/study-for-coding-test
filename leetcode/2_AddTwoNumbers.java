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
        ListNode resultNode = new ListNode(0);
        ListNode tempNode = resultNode;

        int carry = 0;
        int sum = 0;

        while(l1 != null || l2 != null) {
            int num1 = (l1==null) ? 0 : l1.val;
            int num2 = (l2==null) ? 0 : l2.val;

            sum = (num1 + num2 + carry) % 10;
            carry = (num1 + num2 + carry) / 10;

            tempNode.next = new ListNode(sum);
            tempNode = tempNode.next;

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }

        if(carry>0) {
            tempNode.next = new ListNode(carry);
        }



        return resultNode.next;
    }
}