import java.util.Deque;
import java.util.LinkedList;

/**
 * 解题思路：
 * 用两个栈来实现。
 */
class MinStack {

    /** initialize your data structure here. */
    public MinStack() {
        sum_stack = new LinkedList<>();
        min_stack = new LinkedList<>();
    }

    public void push(int x) {
        sum_stack.addLast(x);
        if (min_stack.isEmpty() || min_stack.peekLast() >= x) min_stack.addLast(x);
    }

    public void pop() {
        int item = sum_stack.removeLast();
        if (item == min_stack.peekLast()) min_stack.removeLast();
    }

    public int top() {
        return sum_stack.peekLast();
    }

    public int getMin() {
        return min_stack.peekLast();
    }

    private Deque<Integer> sum_stack;
    private Deque<Integer> min_stack;
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */