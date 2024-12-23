package DSA_Training;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        val = value;
    }
}

 class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            // Process all nodes at current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val);

                // Enqueue left child
                if (current.left != null) {
                    queue.offer(current.left);
                }

                // Enqueue right child
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            // Add current level nodes to result
            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {
        // Construct a tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Perform level-order traversal
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        List<List<Integer>> result = traversal.levelOrder(root);
        System.out.println(result);  // Output: [[3], [9, 20], [15, 7]]
    }
}
