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
      /*  class Solution {
            public int evalRPN(String[] tokens) {
                Stack<Integer> st = new Stack<>();
                for (String s : tokens) {
                    if (s.equals("+")) {
                        st.push(st.pop() + st.pop());
                    } else if (s.equals("-")) {
                        st.push(-st.pop() + st.pop());
                    } else if (s.equals("*")) {
                        st.push(st.pop() * st.pop());
                    } else if (s.equals("/")) {
                        int value1 = st.pop();
                        int value0 = st.pop();
                        st.push(value0 / value1);
                    } else {
                        st.push(Integer.valueOf(s));
                    }
                }
                return st.pop();
            }
        }
       */
        /*class Solution {
            public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> map = new HashMap();
                for (int i = 0; i < nums.length; i++) {
                    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                }
                PriorityQueue<int[]> dq = new PriorityQueue<>((i, j) -> i[1] - j[1]);
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (dq.size() < k) {
                        dq.add(new int[] { entry.getKey(), entry.getValue() });
                    } else {
                        if (entry.getValue() > dq.peek()[1]) {
                            dq.poll();
                            dq.add(new int[] { entry.getKey(), entry.getValue() });
                        }
                    }
                }
                int[] result = new int[k];
                for (int i = k - 1; i >= 0; i--) {
                    result[i] = dq.poll()[0];
                }
                return result;
            }
        }
        -----------------------------------------
        class NewQueue {
    Deque<Integer> dq = new LinkedList<>();
    //poll,add,peek
    void add(int val) {
        while (!dq.isEmpty() && val > dq.getLast()) {
            dq.removeLast();
        }
        dq.add(val);
    }
    void poll(int val) {
        if (!dq.isEmpty() && val == dq.peek()) {
            dq.poll();
        }
    }
    int peek() {
        return dq.peek();
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len - k + 1];
        NewQueue dq = new NewQueue();
        for (int i = 0; i < k; i++) {
            dq.add(nums[i]);
        }
        result[0] = dq.peek();
        for (int i = k; i < len; i++) {
            dq.poll(nums[i - k]);
            dq.add(nums[i]);
            result[i - k + 1] = dq.peek();
        }
        return result;
    }
}
         */
    }
}
