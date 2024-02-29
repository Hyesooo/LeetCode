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
    public ListNode deleteMiddle(ListNode head) {
        int size = this.countSize(head);
        
        if(size == 1) {
            head = null;
        } else {
            this.deleteNode(size/2, 1, head);
        }
        
        return head;
    }

    private int countSize(ListNode node) {
        if(node == null) return 0;
        return this.countSize(node.next)+1;
    }

    private void deleteNode(int target, int cur, ListNode node) {
        if(node == null) return;
        if(cur == target){
            node.next = node.next.next;
            return;
        }

        this.deleteNode(target, cur+1, node.next);
    }
}