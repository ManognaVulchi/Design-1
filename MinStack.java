import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private int min;
  

    public MinStack() {
       this.st = new Stack<>();
       this.min  = Integer.MAX_VALUE;
    }
    
    public void push(int val) {  //O(1)
        if(min >= val)
        {
            st.push(min);
            min = val;
        }
        st.push(val);
    }
    
    public void pop() {
        //O(1)
       if(min == st.pop())
       {
      min = st.pop();
       }
        
    }
    
    public int top() {
        
        return st.peek();
    }
    
    public int getMin() {
   return min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */