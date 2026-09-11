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
       */
       

            }

}
