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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tail = head;
        int length = 0;

        while (tail != null) {
            length++;
            tail = tail.next;
        }

        if (n > length) {
            return head;
        }

        // remove head node
        if (n == length) {
            return head.next;
        }

        tail = head;

        int pos = length - n - 1;
        int i = 0;

        while (i < pos) {
            tail = tail.next;
            i++;
        }

        tail.next = tail.next.next;

        return head;
    }
}