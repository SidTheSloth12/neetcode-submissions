class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        HashMap<Character, Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(map.get(s.charAt(i)));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(s.charAt(i)!=stack.peek()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
