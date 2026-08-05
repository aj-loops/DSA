import java.util.Stack;

// class MinStack {

//     private Stack<Integer> stack;
//     private Stack<Integer> minStack;

//     public MinStack() {
//         stack = new Stack<>();
//         minStack = new Stack<>();
//     }

//     public void push(int val) {

//         stack.push(val);

//         if (minStack.isEmpty()) {
//             minStack.push(val);
//         } else {
//             minStack.push(Math.min(val, minStack.peek()));
//         }
//     }

//     public void pop() {
//         stack.pop();
//         minStack.pop();
//     }

//     public int top() {
//         return stack.peek();
//     }

//     public int getMin() {
//         return minStack.peek();
//     }
// }
class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minst;

    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }

    public void push(int value) {
        st.push(value);

        if (minst.isEmpty()) {
            minst.push(value);
        } else {
            minst.push(Math.min(minst.peek(), value));
        }
    }

    public void pop() {
        st.pop();
        minst.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */