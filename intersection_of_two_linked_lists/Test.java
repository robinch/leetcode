import java.util.Arrays;

public class Test{
	Solution s;
	Solution.ListNode a;
	Solution.ListNode b;

	public Test(){
		s = new Solution();
	}



	public void init(){

	}

	public Solution.ListNode createList(int[] list){
		Solution.ListNode head = s.new ListNode(list[0]);
		Solution.ListNode current = head;
		for(int i = 1; i < list.length; i++){
			current.next = s.new ListNode(list[i]);
			current = current.next;
		}
		return head;
	}



	public void check(Solution.ListNode headA, Solution.ListNode headB){
		Solution.ListNode res = s.getIntersectionNode(headA, headB);
		if(res==null){
			System.out.println("Interesection: null");
		}else{
			System.out.println("Interesection: " + res.val);
		}
	}
	public void test(int[] a , int[] b){
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		Solution.ListNode headA = createList(a);
		Solution.ListNode headB = createList(b);
		check(headA,headB);
	}

	public int[] fuseArray(int[] array1, int[] array2){
		int[] fusedArray = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, fusedArray, 0, array1.length);
		System.arraycopy(array2, 0, fusedArray, array1.length, array2.length);
		return fusedArray;
	}



	public void test(int[] a , int[] b, int[] c){
		int[] arrayA = fuseArray(a,c);
		int[] arrayB = fuseArray(b,c);
		System.out.println("a: " + Arrays.toString(arrayA));
		System.out.println("b: " + Arrays.toString(arrayB));

		Solution.ListNode headA = createList(a);
		Solution.ListNode headB = createList(b);
		Solution.ListNode headC = createList(c);

		Solution.ListNode listA = headA;
		Solution.ListNode listB = headB;
		while(listA.next != null){
			listA = listA.next;
		}
		while(listB.next != null){
			listB = listB.next;
		}
		listA.next = headC;
		listB.next = headC;
		check(headA,headB);
	}

	public void testNoIntersection(){
		int[] a = {1,3,5,7,9,11,13,15,17,19,21};
		int[] b = {6,14,20};
		test(a,b);
	}

	public void testWithIntersection(){
		int[] a = {1,2,3,4};
		int[] b = {6,7,8};
		int[] c = {10,11,12};
		test(a,b,c);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.testNoIntersection();
		t.testWithIntersection();
	}
}