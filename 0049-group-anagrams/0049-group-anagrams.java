
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> store = new HashMap<>();

        int n = strs.length;
        for (int i = 0; i < n; i++) {
            String cur = strs[i];
            String formatStr = makeformat(cur);

            // 만약 저장된 것이 없을 경우
            if (store.get(formatStr) == null) {
                ArrayList<String> values = new ArrayList<>();
                values.add(cur);
                store.put(formatStr, values);
            } else {
                // 저장된 것이 있을 경우 이어 붙이기
                List<String> values = store.get(formatStr);
                values.add(cur);
            }
        }
        List<List<String>> lists = store.values().stream().toList();
        System.out.println();
        return lists;
    }

    public String makeformat(String str) {
        int n = str.length();
        char[] ret = str.toCharArray();

        for (int t = 0; t < n; t++) {
            for (int i = 0; i < n-1; i++) {

                char first = ret[i];
                char second = ret[i + 1];

                if (first > second){
                    ret[i]=second;
                    ret[i+1]=first;
                }

            }
        }
        return Arrays.toString(ret);
    }
}