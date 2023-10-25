class MinStack {

    List<Integer> stack;
    int size;

    public MinStack() {
        stack = new ArrayList<Integer>();
        size = 0;
    }

    public void push(int val) {
        stack.add(size,val);
        size++;
    }

    public void pop() {
        size--;
    }

    public Integer top() {
        if (size==0){
            return null;
        }
        return stack.get(size-1);
    }

    public int getMin() {
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (ret > stack.get(i)){
                ret = stack.get(i);
            }
        }

        return ret;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */