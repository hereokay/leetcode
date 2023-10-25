import java.util.HashMap;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int ret = calc(n);
        while (ret != 1){

            if (map.get(ret)!=null){
                return false;
            }

            map.put(ret,0);
            ret = calc(ret);
        }
        return true;
    }

    public int calc(int n){
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i)-'0';
            sum += a*a;
        }
        return sum;
    }
}