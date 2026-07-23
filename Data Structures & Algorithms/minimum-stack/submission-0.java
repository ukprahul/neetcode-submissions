class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        // if(top >= A.length()-1){
        //     return;
        // }
        if(minStack.isEmpty()){
            minStack.push(val);
        } else{
            int minElement = minStack.peek();
            if (minElement<val) {
                minStack.push(minElement);
            } else {
                minStack.push(val);
            }
        }
        mainStack.push(val);
    }
    
    public void pop() {
        // if(top == -1){
        //     return;
        // }
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        // if(top == -1){
        //     return;
        // }
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
