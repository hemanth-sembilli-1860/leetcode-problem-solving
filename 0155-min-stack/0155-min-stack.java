class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if (minStack.isEmpty() || minStack.peek()>=value){
            minStack.push(value);
        }
    }
    
    public void pop() {
        int d = st.pop();
        if (!minStack.isEmpty() && d == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        if (!st.isEmpty()){
            return st.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if (!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */