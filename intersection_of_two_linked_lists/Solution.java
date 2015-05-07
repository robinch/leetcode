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
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null){
			return null;
		}

		ListNode listA = headA;
		ListNode listB = headB;
		int lengthA = 0;
		int lengthB = 0;
		int diff = 0;
		boolean done = false;		

		while(listA != null || listB != null){
			if(listA != null){
				lengthA ++;
				listA = listA.next;
			}
			if(listB != null){
				lengthB ++;
				listB = listB.next;
			}
		}

		listA = headA;
		listB = headB;

		diff = lengthA - lengthB;
		if(diff > 0){
			for(int i = 0; i < diff; i++){
				listA = listA.next;
			}
		}else{
			diff = -1*diff;
			for(int i = 0; i < diff; i++){
				listB = listB.next;
			}
		}


		while(listA != null){
			if(listA == listB){
				return listA;
			}
			listA = listA.next;
			listB = listB.next;
		}
		return null;



	}
}