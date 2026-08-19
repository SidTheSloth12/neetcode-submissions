class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int z:stones){
            heap.add(z);
        }
        while(heap.size()>1){
            int x=heap.poll();
            int y=heap.poll();
            if(x!=y){
                heap.add(x-y);
            }
        }
        return heap.isEmpty()?0:heap.poll();
    }
}
