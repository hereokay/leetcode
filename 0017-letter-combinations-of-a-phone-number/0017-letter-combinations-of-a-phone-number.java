class Solution {
    public static final List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        list.clear();
        char[][] board = {
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'w','x','y','z'}
        };

        int length = digits.length();
           if (length==0){
            return list;
        }
        recur(0,digits,length,new Stack<Character>(), board);
        return list;
    }

    public void recur(int depth, String digits, int limitDepth, Stack<Character> result, char[][] board){
        if (depth==limitDepth){
            list.add(toStr(result));
            return ;
        }

        int i = digits.charAt(depth) - '2';
        char[] chars = board[i];

        for (int j = 0; j < chars.length; j++) {
            result.add(chars[j]);
            recur(depth+1,digits,limitDepth,result,board);
            result.pop();
        }
    }
    public String toStr(Stack<Character> result){
        String ret = "";
        for (int i = 0; i < result.size(); i++) {
            ret += result.get(i);
        }
        return ret;
    }

}