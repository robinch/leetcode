import java.util.Arrays;

public class Test{

	Solution s;

	public Test(){
		s = new Solution();
	}

	public void test(String[] rpn, int trueAnswer){
		int result = s.evalRPN(rpn);
		System.out.format("rpn: %s%n", Arrays.toString(rpn));
		System.out.format("Right answer: %d%nGot answer: %d%n", trueAnswer, result);
	}

	public static void main(String[] args) {
		Test t = new Test();
		String[] test1 =   {"2", "1", "+", "3", "*"};
		String[] test2 =   {"4", "13", "5", "/", "+"};
		t.test(test1, 9);
		t.test(test2, 6);
		System.out.println(13/5);
	}
}