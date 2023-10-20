class Solution {
    public int romanToInt(String s) {
         int length = s.length();
        int idx = 0;
        int ans = 0;

        char[] symList = {
                'I','V','X','L','C','D','M'
        };
        int[] valList = {
                1,5,10,50,100,500,1000
        };
        for (int i = 0; i < length; i++) {
            char cur = s.charAt(i);
            for (int j = 0; j < 7; j++) {
                if (cur==symList[j]){
                    ans+=valList[j];
                }
            }
        }
        while (idx < length){
            if (idx == length-1){
                break;
            }
            char cur = s.charAt(idx);
            if (cur=='I'){
                char next = s.charAt(idx + 1);
                if (next=='V' || next=='X'){
                    ans-= 2;
                }
            }

            if (cur=='X'){
                char next = s.charAt(idx + 1);
                if (next=='L' || next=='C'){
                    ans-= 20;
                }
            }

            if (cur=='C'){
                char next = s.charAt(idx + 1);
                if (next=='D' || next=='M'){
                    ans-= 200;
                }
            }
            idx +=1;
        }
        return ans;
    }
}