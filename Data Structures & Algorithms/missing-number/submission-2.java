class Solution {
    public int missingNumber(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=sum^nums[i];
        }
        for(int i=0;i<nums.length+1;i++){
            sum=sum^i;
        }
        return sum;
    }
}
