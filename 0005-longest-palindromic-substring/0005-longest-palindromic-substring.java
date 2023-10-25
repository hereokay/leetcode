class Solution {
    public String sol1(String s){
        int length = s.length();
        int ansMID = 0;
        int ansJ = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int cnt = 0;
            for (int j = 0; j <= Math.min(i,length-1-i); j++) {
                if (s.charAt(i-j) != s.charAt(i+j)){
                    break;
                }
                cnt = j;
            }
            if (ansJ < cnt){
                ansJ = cnt;
                ansMID = i;
            }
        }

        String substring = s.substring(ansMID - ansJ, ansMID + ansJ+1);

        return substring;
    }
    public String sol2(String s){

        int length = s.length();
        int ansMID = 0;
        int ansJ = Integer.MIN_VALUE;

        if (length < 2){
            return "";
        }

        for (int i = 0; i < s.length(); i++) {
            int cnt = Integer.MIN_VALUE;
            for (int j = 0; j <= Math.min(i,length-2-i); j++) {
                if (s.charAt(i-j) != s.charAt(i+1+j)){

                    break;
                }
                cnt = j;
            }
            if (ansJ < cnt){
                ansJ = cnt;
                ansMID = i;
            }
        }
if (ansJ==Integer.MIN_VALUE){
            return "";
        }
        String substring = s.substring(ansMID - ansJ, ansMID + ansJ+2);
        return substring;
    }

    public String longestPalindrome(String s) {
        String s1 = sol1(s);
        String s2 = sol2(s);
        if (s1.length() > s2.length()){
            return s1;
        }
        else{
            return s2;
        }
    }
}