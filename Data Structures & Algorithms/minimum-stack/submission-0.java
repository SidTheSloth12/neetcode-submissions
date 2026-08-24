class MinStack {
    int min;Deque<Integer> stack;PriorityQueue<Integer> minheap;
    public MinStack() {
        stack = new ArrayDeque<>();
        minheap= new PriorityQueue<>();
    }
    public void push(int val) {
        stack.push(val);
        minheap.add(val);
    }
    public void pop() {
        minheap.remove(stack.pop());
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minheap.peek();
    }
}
