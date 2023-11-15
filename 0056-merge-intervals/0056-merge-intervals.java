
class Solution {
    public void preSort(int[][] intervals){
        Arrays.sort(intervals,
                Comparator.comparingInt(arr -> arr[0]));
    }
    public int[][] merge(int[][] intervals) {

        preSort(intervals);

        int n = intervals.length;


        int[] cur = intervals[0];
        int idx = 1;
        List<int[]> ans = new ArrayList<>();
        while(idx <= n){

            if (idx == n){
                ans.add(cur);
                break;
            }

            int[] next = intervals[idx];

            if (next[0] <= cur[1]){
                // 연장
                cur[1] = Math.max(next[1],cur[1]);
            }
            else{
                ans.add(cur);
                cur = next;
            }

            idx+=1;
        }

        int size = ans.size();

        int[][] ret = new int[size][2];
        for (int i = 0; i < size; i++) {
            ret[i] = new int[]{ans.get(i)[0],ans.get(i)[1]};
        }
        return ret;
    }
}
