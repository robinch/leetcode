public class Solution {
    public int rob(int[] num) {

    	if(num.length == 0) return 0;
    	if(num.length == 1) return num[0];
        if (num.length > 1) num[1] = Math.max(num[0], num[1]);
        for (int i = 2; i < num.length; i++)
            num[i] = Math.max(num[i-2] + num[i], num[i-1]);
        return num[num.length-1];
    }
}