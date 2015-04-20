public class Solution {
    public int titleToNumber(String s) {
    	int sum = 0;
    	int base = "A".charAt(0);
		for(int i = 0; i < s.length(); i++){
			sum = sum * 26 + s.charAt(i) - base + 1 ;
		}
		return sum;
    }
}