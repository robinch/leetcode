import java.util.EmptyStackException;

class MinStack {
	StackNode head;
	int size = 0;
	int min = Integer.MAX_VALUE;

    public void push(int x) {
    	StackNode node = new StackNode(x);
        if (head == null){
        	head = node;
        	min = x;
        }else {
        	node.prev = head;
        	head = node;
        	if (x < min) {
        		min = x;
        	}
        }
        size++;
    }

    public void pop() throws EmptyStackException{
    	if(head == null ){
    		throw new EmptyStackException();
    	} else {
    		if (head.value == min){
    			head = head.prev;
    			StackNode node = head;
    			min = Integer.MAX_VALUE;
    			size--;
    			for (int i = 0; i < size; i++){
    				if (node.value < min) {
    					min = node.value;
    				}
    				node = node.prev;
    			}
    		} else {
    			head = head.prev;
    			size--;
    		}    		
    	}
    }

    public int top() throws EmptyStackException{
        if(head == null ){
    		throw new EmptyStackException();
    	} else {
    		return head.value;
    	}
    }

    public int getMin() {
        return min;
    }

    class StackNode{
    	int value;
    	StackNode prev;
    	StackNode(int value){
    		this.value = value;
    	}
    }
}