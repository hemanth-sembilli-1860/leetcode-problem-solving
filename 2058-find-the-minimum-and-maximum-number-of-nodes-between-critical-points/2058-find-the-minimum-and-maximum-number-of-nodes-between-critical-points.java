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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        int c = 0;
        while (prev!=null){
            c++;
            prev = prev.next;
        }
        if (c<=2){
            return new int[]{-1,-1};
        }
        ListNode curr = head.next;
        ListNode next = curr.next;
        ListNode temp = head;
        int prevCritical = -1;
        int firstCritical = -1;
        int ind = 1;
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
        while (next!=null){
            if (curr.val > temp.val && curr.val > next.val ||
                curr.val < temp.val && curr.val < next.val) {
            if (firstCritical == -1) {
                firstCritical = ind;
            }
            if (prevCritical != -1) {
                minDistance = Math.min(minDistance, ind - prevCritical);
                maxDistance = Math.max(maxDistance, ind - firstCritical);
            }
            prevCritical = ind;
        }
            temp = temp.next;
            curr = curr.next;
             next = next.next;
            ind++;
        }
        if (minDistance == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        return new int[]{minDistance, maxDistance};
    }
}