class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack();
        for(String i : tokens){
            if(!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/")) {
                stack.push(i);
            }
            else {
                String b1 = stack.pop();
                String a1 = stack.pop();
                Integer a = Integer.parseInt(a1);
                Integer b = Integer.parseInt(b1);
                Integer result = 0;
                switch(i) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    case "/":
                        result = a/b;
                        break;
                }
                stack.push(String.valueOf(result));
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
