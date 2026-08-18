class Solution {
    public boolean isPalindrome(String s) {
        int i=0;int j=s.length()-1;
        while(j>i){
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j)))){
                return false;
            }
            j--;i++;
        }
        return true;
    }
}
