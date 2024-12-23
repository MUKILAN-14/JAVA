package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree{
    TreeNode root;
    void levelOrderTraversal(){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
           TreeNode treeNode=queue.poll();
           System.out.print(treeNode.data+" ");
           if(treeNode.left!=null){
            queue.add(treeNode.left);
           }
           if(treeNode.right!=null){
            queue.add(treeNode.right);
           }

        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new TreeNode(2);
        tree.root.left=new TreeNode(8);
        tree.root.right=new TreeNode(4);
        tree.root.left.left=new TreeNode(3);
        tree.root.left.right=new TreeNode(7);
        tree.root.right.right=new TreeNode(1);
        tree.root.right.right.left=new TreeNode(6);
        tree.levelOrderTraversal();
    }
}