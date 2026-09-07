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
        /*class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (i == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (i == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(i);
            }

        }
        return stack.isEmpty();
    }
}
*/
    /*    class Solution {
            public String removeDuplicates(String s) {
                Stack<Character> nums = new Stack<>();
                for (int j = 0; j < s.length(); j++) {
                    if (!nums.isEmpty() && nums.peek() == s.charAt(j)) {
                        nums.pop();
                    } else {
                        nums.push(s.charAt(j));
                    }
                }
                StringBuffer st = new StringBuffer();
                for (char i : nums) {
                    st.append(i);
                }
                return st.toString();
            }
        }

         */
        /*class Solution {
    public String removeDuplicates(String s) {
        StringBuffer st=new StringBuffer();
        int top=-1;
        for(int i=0;i<s.length();i++){
            char j=s.charAt(i);
          if(top>=0&&st.charAt(top)==j){
            st.deleteCharAt(top);
            top--;
          }else{
            st.append(j);
            top++;
          }
        }
        return st.toString();
    }
}*/

    }
}
