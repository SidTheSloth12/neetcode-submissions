class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int z:stones){
            heap.add(z);
        }
        int n=stones.length;
        while(n>1){
            int x=heap.poll();n--;
            int y=heap.poll();n--;
            if(x!=y){
                heap.add(x-y);n++;
            }
        }
        if(n==1){
            return heap.poll();
        }
        return 0;
    }
}
