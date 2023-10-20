class Solution {
    public boolean isValid(String s) {
        char[] openUnit = {'(', '[', '{'};
        char[] closeUnit = {')',']','}'};
        Stack<Integer> order = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            for (int j = 0; j < 3; j++) {
                if (cur==openUnit[j]){
                    order.add(j);
                }
            }

            for (int j = 0; j < 3; j++) {
                if (cur==closeUnit[j]){
                    if (order.size()==0){
                        return false;
                    }

                    Integer pop = order.pop();
                    if (pop!=j){
                        return false;
                    }
                }
            }
        }
        if (order.size()!=0){
            return false;
        }
        return true;
    }
}