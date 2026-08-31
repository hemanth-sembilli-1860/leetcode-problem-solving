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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode curr = head;
        ListNode start = null;
        ListNode end = null;
        ListNode beforeStart = null;
        int ind = 1;
        while (curr!=null){
            if (ind == left){
                start = curr;
            }
            else if (ind == right){
                end = curr;
                break;
            }
            if (ind == left - 1) {
                beforeStart = curr;
            }

            curr = curr.next;
            ind++;
        }
        ListNode prev = null;
        curr = start;
        ListNode afterEnd = end.next;
        while (curr!=afterEnd){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (beforeStart != null) {
            beforeStart.next = prev;
        } else {
            head = prev;
        }
        start.next = afterEnd;
        return head;
    }
}