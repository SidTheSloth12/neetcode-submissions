class MinStack {
    int min;Deque<Integer> stack;Deque<Integer> minstack;
    public MinStack() {
        stack = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
    }
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || minstack.peek()>=val){
            minstack.push(val);
        }
    }
    public void pop() {
        if(minstack.peek().equals(stack.pop())){
            minstack.pop();
        }
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minstack.peek();
    }
}
