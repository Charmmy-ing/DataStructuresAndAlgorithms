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
        */
        
            }

}
