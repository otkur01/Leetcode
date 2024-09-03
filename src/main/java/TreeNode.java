import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        if (root == null) {
            root = newNode;
            return root;
        }

        TreeNode current = root;

        while (true) {
            if (val < current.val) {
                if (current.left == null) {
                    current.left = newNode;
                    return root;
                }
                current = current.left;

            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return root;
                }

                current = current.right;
            }


        }


    }

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        if (root == null) {
            return null;
        }

        TreeNode current = root;

        while (current != null) {
            if (val > current.val) current = current.right;
            else if (val < current.val) current = current.left;
            else return current;

        }
        return null;
    }


        public List<Integer> inorderTraversal (TreeNode root){
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode current = root;

            while (current != null || !stack.isEmpty()) {
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                result.add(current.val);
                current = current.right;
            }

            return result;
        }



    public static  int maxDepth(TreeNode root) {
        if(root==null)return 0;


        // Recursive case: calculate the depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // The depth of the current node is 1 (for the current node itself) plus
        // the maximum depth of the left and right subtrees
        return Math.max(leftDepth, rightDepth) + 1;


    }

    public int maxDepth2(TreeNode root) {
        // If the tree is empty, the depth is 0
        if (root == null) {
            return 0;
        }

        // Initialize the queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        // While there are nodes to process in the queue
        while (!queue.isEmpty()) {
            // Number of nodes at the current level
            int levelSize = queue.size();
            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                // Add the child nodes of the current node to the queue
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            // Increment depth after processing all nodes at the current level
            depth++;
        }

        return depth;
    }



    }


