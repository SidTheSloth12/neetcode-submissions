class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int[] output=new int[n];
        prefix[0]=1;suffix[n-1]=1;
        int t=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=t;
            t*=nums[i];
        }
        t=nums[n-1];
        for(int i=n-2;i>-1;i--){
            suffix[i]=t;
            t*=nums[i];
        }
        for(int i=0;i<n;i++){
            output[i]=prefix[i]*suffix[i];
        }
        return output;
    }
}  
