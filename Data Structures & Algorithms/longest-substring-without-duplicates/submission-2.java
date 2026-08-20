class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int i=0,j,max=0;
        for(j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j))+1,i);
            }
            map.put(s.charAt(j),j);
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
