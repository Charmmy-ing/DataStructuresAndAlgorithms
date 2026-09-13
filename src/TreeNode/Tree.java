package TreeNode;

import javax.swing.tree.TreeNode;

public class Tree {
    public static void main(String[] args) {
      /*
         * Definition for a binary tree node.
         * public class TreeNode {
         *     int val;
         *     TreeNode left;
         *     TreeNode right;
         *     TreeNode() {}
         *     TreeNode(int val) { this.val = val; }
         *     TreeNode(int val, TreeNode left, TreeNode right) {
         *         this.val = val;
         *         this.left = left;
         *         this.right = right;
         *     }
         * }

        class Solution {
            public List<Integer> preorderTraversal(TreeNode root) {
                List<Integer> result = new ArrayList<>();
                Stack<TreeNode> stack = new Stack<>();
                if (root == null) {
                    return result;
                }
                stack.push(root);
                while (!stack.isEmpty()) {
                    TreeNode node = stack.pop();
                    result.add(node.val);
                    if (node.right != null) {
                        stack.push(node.right);
                    }
                    if (node.left != null) {
                        stack.push(node.left);
                    }
                }
                return result;
                * ------------------------------
                * /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }

        class Solution {
            public List<Integer> preorderTraversal(TreeNode root) {
                List<Integer> result = new ArrayList<>();
                Stack<TreeNode> stack = new Stack<>();
                if (root == null) {
                    return result;
                }
                stack.push(root);
                while (!stack.isEmpty()) {
                    TreeNode node = stack.pop();
                    result.add(node.val);
                    if (node.right != null) {
                        stack.push(node.right);
                    }
                    if (node.left != null) {
                        stack.push(node.left);
                    }
                }
                return result;

            }
        }
        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }

        class Solution {
            public List<Integer> postorderTraversal(TreeNode root) {
                Stack<TreeNode> stack = new Stack<>();
                List<Integer> result = new ArrayList<>();
                if (root == null) {
                    return result;
                }
                stack.push(root);
                while (!stack.isEmpty()) {
                    TreeNode cur = stack.pop();
                    result.add(cur.val);
                    if (cur.left != null) {
                        stack.push(cur.left);
                    }
                    if (cur.right != null) {
                        stack.push(cur.right);
                    }

                }
                Collections.reverse(result);
                return result;
            }
        }
        class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (cur != null) {
                stack.pop();
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                stack.push(cur);
                stack.push(null);
                if (cur.left != null) {
                    stack.push(cur.left);
                }
            } else {
                stack.pop();
                cur = stack.peek();
                stack.pop();
                list.add(cur.val);
            }
        }
        return list;
    }
}
----------------------------------------------
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (cur != null) {
                stack.pop();
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                stack.push(cur);
                stack.push(null);
                if (cur.left != null) {
                    stack.push(cur.left);
                }
            } else {
                stack.pop();
                cur = stack.peek();
                stack.pop();
                list.add(cur.val);
            }
        }
        return list;
    }
}-------------------------------------------------
       /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 ----------------------------------------------------------------
        class Solution {
            List<List<Integer>> list = new ArrayList<List<Integer>>();

            public List<List<Integer>> levelOrder(TreeNode root) {
                Treeresult(root);
                return list;
            }

            public void Treeresult(TreeNode root) {
                if (root == null) {
                    return;
                }
                Queue<TreeNode> que = new LinkedList<>();
                que.add(root);
                while (!que.isEmpty()) {
                    List<Integer> result = new ArrayList<>();
                    int len = que.size();
                    while (len > 0) {
                        TreeNode cur = que.poll();
                        result.add(cur.val);
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                    list.add(result);
                }
            }
        }

       */
/*
        class Solution {
            List<List<Integer>> result = new LinkedList<>();
            public List<List<Integer>> levelOrderBottom(TreeNode root) {
                TreeN(root);
                return result;
            }

            public void TreeN(TreeNode root) {
                if (root == null) {
                    return;
                }
                Queue<TreeNode> que = new LinkedList<>();
                que.offer(root);
                // List<List<Integer>> rep = new ArrayList<>();
                while (!que.isEmpty()) {
                    int len = que.size();
                    List<Integer> list = new ArrayList<>();
                    while (len > 0) {
                        TreeNode cur = que.poll();
                        list.add(cur.val);
                        if (cur.left != null) {
                            que.offer(cur.left);
                        }
                        if (cur.right != null) {
                            que.offer(cur.right);
                        }
                        len--;
                    }
                    //rep.add(list);
                    //result.add(list);
                    result.addFirst(list);
                }

                // for (int i = rep.size() - 1; i >= 0; i--) result.add(rep.get(i));
                //Collections.reverse(result);

            }
        }
*/
        /*
        class Solution {
            public List<Integer> rightSideView(TreeNode root) {
                List<Integer> result = new LinkedList<>();
                if (root == null) {
                    return result;
                }
                Queue<TreeNode> que = new LinkedList<>();
                que.offer(root);
                while (!que.isEmpty()) {
                    int len = que.size();
                    while (len > 0) {
                        TreeNode cur = que.poll();
                        if (len == 1) {
                            result.add(cur.val);
                        }
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                }
                return result;
            }
        }

         */
        /*
        class Solution {
            public List<Double> averageOfLevels(TreeNode root) {
                List<Double> result = new LinkedList<>();
                if (root == null) {
                    return result;
                }
                Queue<TreeNode> que = new LinkedList<>();
                que.offer(root);
                while (!que.isEmpty()) {
                    int len = que.size();
                    int size = len;
                    Double nums = 0.0;
                    while (len > 0) {
                        TreeNode cur = que.poll();
                        nums += cur.val;
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                    result.add(nums / size);

                }
                return result;
            }
        }
        /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

        class Solution {
            public List<List<Integer>> levelOrder(Node root) {
                List<List<Integer>> result = new ArrayList<>();
                Queue<Node> que = new LinkedList<>();
                if (root == null) {
                    return result;
                }
                que.offer(root);
                while (!que.isEmpty()) {
                    int len = que.size();
                    List<Integer> list = new ArrayList();
                    for (int i = 0; i < len; i++) {
                        Node cur = que.poll();
                        list.add(cur.val);
                        List<Node> treeChild = new ArrayList<>();
                        treeChild = cur.children;
                        if (treeChild == null || treeChild.size() == 0) {
                            continue;
                        }
                        for (Node child : treeChild) {
                            que.offer(child);
                        }
                    }
                    result.add(list);
                }
                return result;
            }
        }
        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }

        class Solution {
            public List<Integer> largestValues(TreeNode root) {
                List<Integer> result = new ArrayList<>();
                Queue<TreeNode> que = new LinkedList<>();
                if (root == null) {
                    return result;
                }
                que.add(root);
                while (!que.isEmpty()) {
                    int len=que.size();
                    int max = Integer.MIN_VALUE;
                    while (len > 0) {
                        TreeNode cur = que.poll();
                        max = Math.max(max, cur.val);
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                    result.add(max);
                }
                return result;
            }
        }
        /*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


        class Solution {
            public Node connect(Node root) {
                Queue<Node> que = new LinkedList<>();
                Node cur = new Node();
                if (root == null) {
                    return root;
                }
                que.add(root);
                while (!que.isEmpty()) {
                    int len = que.size();
                    while (len > 0) {
                        cur = que.poll();
                        if (len == 1) {
                            cur.next = null;
                        } else {
                            cur.next = que.peek();
                        }
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                }
                return root;
            }
        }
        /*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

        class Solution {
            public Node connect(Node root) {
                Queue<Node> que = new LinkedList<>();
                Node cur = new Node();
                if (root == null) {
                    return null;
                }
                que.add(root);
                while (!que.isEmpty()) {
                    int len = que.size();
                    while (len > 0) {
                        cur = que.poll();
                        if (len == 1) {
                            cur.next = null;
                        } else {
                            cur.next = que.peek();
                        }
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                }
                return root;
            }
        }
        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }

        class Solution {
            public int maxDepth(TreeNode root) {
                Queue<TreeNode> que = new LinkedList<>();
                int depth = 0;
                if (root == null) {
                    return depth;
                }
                que.add(root);

                while (!que.isEmpty()) {
                    int len = que.size();
                    while (len > 0) {
                        TreeNode cur = que.poll();
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                    depth++;
                }
                return depth;
            }
        }
        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }

        class Solution {
            public int minDepth(TreeNode root) {
                Queue<TreeNode> que = new LinkedList<>();
                int depth = 0;
                if (root == null) {
                    return depth;
                }
                que.add(root);

                while (!que.isEmpty()) {
                    int len = que.size();
                    while (len > 0) {
                        TreeNode cur = que.poll();
                        if (cur.left == null && cur.right == null) {
                            return depth + 1;
                        }
                        if (cur.left != null) {
                            que.add(cur.left);
                        }
                        if (cur.right != null) {
                            que.add(cur.right);
                        }
                        len--;
                    }
                    depth++;
                }
                return depth;
            }
        }

         */





            }

}
