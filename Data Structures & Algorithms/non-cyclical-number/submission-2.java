class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map=new HashMap<>();
        while(true){
            if(map.containsKey(n)){
                return false;
            }
            map.put(n,n);
            int sum=0;
            while(n>0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            if(sum==1){
                return true;
            }
            n=sum;
        }
    }
}
