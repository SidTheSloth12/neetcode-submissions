class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int mp=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(prices[0]);
        for(int i=1;i<prices.length;i++){
            mp=Math.max(mp,prices[i]-minHeap.peek());
            minHeap.add(prices[i]);
        }
        return mp;
    }
}
