import java.util.Deque;
import java.util.LinkedList;

/**
 * 解题思路：
 * 利用两个栈，一个用于保存入队列，一个用于出队列。
 */
class MyQueue {

    /** Initialize your data structure here. */
    public MyQueue() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.addLast(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (out.isEmpty()) {
            while (! in.isEmpty()) {
                out.addLast(in.removeLast());
            }
        }
        return out.removeLast();
    }

    /** Get the front element. */
    public int peek() {
        if (out.isEmpty()) {
            while (! in.isEmpty()) {
                out.addLast(in.removeLast());
            }
        }
        return out.getLast();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private Deque<Integer> in;
    private Deque<Integer> out;
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */