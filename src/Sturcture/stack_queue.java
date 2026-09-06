package Sturcture;

public class stack_queue {
    public static void main(String[] args) {
       /* class MyStack {
            Queue<Integer> queue;

            public MyStack() {
                queue = new LinkedList<Integer>();
            }

            public void push(int x) {
                queue.add(x);
            }

            public int pop() {
                rePosition();
                return queue.poll();
            }

            public int top() {
                rePosition();
                int result = queue.poll();
                queue.add(result);
                return result;
            }

            public boolean empty() {
                return queue.isEmpty();
            }

            //把队列的前n-1个元素移到队列后面；
            private void rePosition() {
                int size = queue.size();
                while (size-- > 1) {
                    queue.add(queue.poll());
                }

            }
        }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
        /*class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackout;

    public MyQueue() {
        stackIn = new Stack<Integer>();
        stackout = new Stack<Integer>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpStackIn();
        return stackout.pop();
    }

    public int peek() {
        dumpStackIn();
        return stackout.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackout.isEmpty();
    }

    private void dumpStackIn() {
        if (!stackout.isEmpty()) {
            return;
        }
        while (!stackIn.isEmpty()) {
            stackout.push(stackIn.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

    }
}
