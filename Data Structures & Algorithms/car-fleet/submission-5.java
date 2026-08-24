class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0)
            return 0;
        double[][] pairs = new double[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));
        int fleet= 0;
        double time = 0; 
        for (int i = 0; i < n; i++) {
            double currentTime = (target - pairs[i][0]) / pairs[i][1];
            if (currentTime > time) {
                time = currentTime;
                fleet++;
            }
        }
        return fleet;
    }
}