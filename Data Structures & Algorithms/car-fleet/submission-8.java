class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n<2)
            return n;
        double[][] pairs = new double[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));
        Deque<Double> stack=new ArrayDeque<>();
        double time=(target-pairs[0][0])/pairs[0][1];
        stack.push(time);
        for(int i=1;i<n;i++){
            time=(target-pairs[i][0])/pairs[i][1];
            if(stack.peek()<time){
                stack.push(time);
            }
        }
        return stack.size();
    }
}