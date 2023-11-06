class Solution {
    static List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        ans.clear();
        recur(0,nums.length,new ArrayList<>(),new boolean[nums.length],nums);
        return ans;
    }

    public void recur(int depth, int limit, List<Integer> now, boolean[] visited, int[] nums){
        if (depth==limit){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < now.size(); i++) {
                list.add(now.get(i));
            }
            ans.add(list);
            return;
        }

        for (int i = 0; i < limit; i++) {
            if (visited[i]){
                continue;
            }
            int num = nums[i];
            visited[i]=true;
            now.add(num);
            recur(depth+1, limit, now,visited,nums);
            now.remove(now.size()-1);
            visited[i]=false;
        }

    }
}