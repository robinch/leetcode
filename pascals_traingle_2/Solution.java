import java.util.ArrayList;
import java.util.List;


public class Solution {
 
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<Integer>(rowIndex+1);
        int half = roundUpIntDivision(rowIndex + 1,2);

        for(int i = 0; i < half  ; i ++){
            Integer bin = new Integer((int) binomial(rowIndex, i)); 
            list.add(i, bin);
            list.add(list.size() - 1 - i, bin);
        }

        return list;
    }

    private int roundUpIntDivision(int k, int n){
        return (int) Math.ceil((double) k / (double) n);
    }

    private long binomial(int n, int k)
    {
        if (k>n-k){
            k=n-k;
        }

        long b=1;
        for (int i=1, m=n; i<=k; i++, m--){
            b=b*m/i;
        }
        return b;
    }

    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.roundUpIntDivision(Integer.parseInt(args[0]) + 1, 2));
        System.out.println(s.getRow(Integer.parseInt(args[0])));
    }
}