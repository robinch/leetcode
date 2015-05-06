public class Solution {
	public int evalRPN(String[] tokens) {
		Stack stack = new Stack();
		String operators = "+-*/";
		int a;
		int b;
		int res;
		for(String s : tokens){
			if(!operators.contains(s)){
				stack.push(Integer.parseInt(s));
			}else{
				a = stack.pop();
				b = stack.pop();
				switch(s){
					case "+": 
						stack.push(b + a);
						break;
					case "-":
						stack.push(b - a);
						break;
					case "*":
						stack.push(b * a);
						break;
					case "/": 
						stack.push(b/a);
						break;
				}
			}
		}
		return stack.pop();
	}

	class Node{
		int value;
		Node next;
		public Node(int v){
			value = v;
		}
	}

	class Stack{
		Node top;

		public void push(int n){
			Node node = new Node(n);
			if (!(top == null)){
				node.next = top;
			}
			top = node;
		}

		public int pop(){
			if(top == null){
				return 0;
			}
			int value = top.value;
			top = top.next;
			return value;
		}
	}
}