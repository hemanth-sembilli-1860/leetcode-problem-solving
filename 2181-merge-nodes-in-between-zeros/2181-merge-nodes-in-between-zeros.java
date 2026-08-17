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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int sum = 0;
        while (curr!=null){
            sum += curr.val;
            if (curr.next != null && curr.next.val == 0){
                temp.next = new ListNode(sum);
                temp  = temp.next;
                sum = 0;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}