class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                arr[stack.peek()]=i-stack.peek();stack.pop();
            }
            stack.push(i);
        }
        return arr;
    }
}
