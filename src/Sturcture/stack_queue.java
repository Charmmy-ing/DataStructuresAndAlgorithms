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
    }
}
