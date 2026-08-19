class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[46];
        arr[0]=0;arr[1]=1;arr[2]=2;arr[3]=3;
        for(int i=4;i<n+1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
