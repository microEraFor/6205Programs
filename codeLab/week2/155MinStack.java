class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        s=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int x) {
        if(s.isEmpty()){
            min.add(x);
        }else{
            if(x<min.peek()) min.add(x);
            else min.add(min.peek());
        }
        s.add(x);
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */