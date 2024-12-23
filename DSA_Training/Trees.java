package DSA_Training;

class TreeNode {
    int data;
    int height;
    TreeNode left;
    TreeNode right;
    

    TreeNode(int value) {
        data = value;
        height=1;
    }
}

class AVLTree {
    TreeNode root;

    int height(TreeNode n) { 
        if (n == null) 
            return 0; 
        return n.height; 
    } 

    int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 

    TreeNode rightRotate(TreeNode y) { 
        TreeNode x = y.left; 
        TreeNode T2 = x.right; 
  
        x.right = y; 
        y.left = T2; 

        y.height = max(height(y.left), height(y.right)) + 1; 
        x.height = max(height(x.left), height(x.right)) + 1; 

        return x; 
    } 

    TreeNode leftRotate(TreeNode x) { 
        TreeNode y = x.right; 
        TreeNode T2 = y.left; 
   
        y.left = x; 
        x.right = T2; 

        x.height = max(height(x.left), height(x.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
 
        return y; 
    } 

    int getBalance(TreeNode N) { 
        if (N == null) 
            return 0; 
  
        return height(N.left) - height(N.right); 
    }

    TreeNode insert(TreeNode node, int data) { 
        if (node == null) 
            return (new TreeNode(data)); 
        if (data < node.data) 
            node.left = insert(node.left, data); 
        else if (data > node.data) 
            node.right = insert(node.right, data); 
        else  
            return node; 
        node.height = 1 + max(height(node.left), 
                              height(node.right)); 
  
        int balance = getBalance(node); 
        if (balance > 1 && data < node.left.data) 
            return rightRotate(node); 
   
        if (balance < -1 && data > node.right.data) 
            return leftRotate(node); 
   
        if (balance > 1 && data > node.left.data) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        }
        if (balance < -1 && data < node.right.data) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
        return node; 
    }  

    void preOrder(TreeNode node) { 
        if (node != null) { 
            System.out.println(node.data + " "); 
            preOrder(node.left); 
            preOrder(node.right); 
        } 
    } 

    public static void main(String[] args) {
        AVLTree tree = new AVLTree(); 
  
        tree.root = tree.insert(tree.root, 10); 
        tree.root = tree.insert(tree.root, 20); 
        tree.root = tree.insert(tree.root, 30); 
        tree.root = tree.insert(tree.root, 40); 
        tree.root = tree.insert(tree.root, 50); 
        tree.root = tree.insert(tree.root, 25); 
        System.out.println("Preorder traversal" + 
        " of constructed tree is : "); 
        tree.preOrder(tree.root); 
       
    }
}