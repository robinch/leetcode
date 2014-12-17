/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;

    	ListNode node;
    	ListNode prev;
    	int val;
    	val = head.val;
    	prev = head;
    	node = head.next;
 		while (node != null){
 			if (node.val == val){
 				deleteNode(node, prev);
 			} else {
 				val = node.val;
 				prev = node;
 			}
 			node = node.next;
 		}   
 		return head;    
    }

    private void deleteNode(ListNode node, ListNode prevNode){
    	prevNode.next = node.next;
    }


}