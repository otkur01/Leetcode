import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    }


