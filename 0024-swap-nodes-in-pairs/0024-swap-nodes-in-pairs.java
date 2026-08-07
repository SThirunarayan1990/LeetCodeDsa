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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        ListNode first = head;
        ListNode prevPair = dummy;
        int count = 0;
        while (curr != null) {
            count = count + 1;
            if (count == 2) {
                ListNode second = curr;

                first.next = second.next;
                second.next = first;
                prevPair.next = second;

                prevPair = first;
                curr = first.next;
                first = curr;
                count = 0;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}