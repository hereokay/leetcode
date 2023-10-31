class Solution {
    static List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        ans.clear();

        recur(0,n*2,0,"");

        return ans;
    }

    public void recur(int depth, int limit, int cnt,String s){
        if (depth==limit){
            if (cnt == 0){
                ans.add(s);
            }
            return;
        }

        if (cnt > 0){
            String removeS = s + ")";
            recur(depth+1, limit,cnt-1,removeS);

            String addS = s+"(";
            recur(depth+1,limit,cnt+1,addS);
        }
        else{
            String addS = s +"(";
            recur(depth+1,limit,cnt+1,addS);
        }
    }
}