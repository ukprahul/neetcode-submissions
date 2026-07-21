class Solution {
    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        if(s.length() == 0 || s.length() == 1){
            return false;
        }
        for(char c: array){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.size()>=1) {
                    char temp = stack.peek();
                    if(temp == '(') 
                    {
                     stack.pop();
                    } else
                    {
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(c == ']') {
                if(stack.size()>=1)
                {
                    char temp = stack.peek();

                    if(temp == '[') {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else if(c == '}') {
                if(stack.size()>=1){
                    char temp = stack.peek();
                    if(temp == '{') {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                else {
                    return false;
                }
                
            }
            else {
                if(stack.size()!=0) {
                    return false;
                }
            }
        }
        if(stack.size() == 0){
            return true;
        }
        return false;
        
    }
}
