// Node class representing a node in the binary tree
class TreeNode01 {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode01(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

// BinaryTree class representing the binary tree
class preorder {
    // Root of the binary tree
    TreeNode root;

    preorder() {
        root = null;
    }

    // Method to perform preorder traversal recursively
    void preOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        // Visit the current node
        System.out.print(node.val + " ");

        // Traverse left subtree
        preOrderTraversal(node.left);

        // Traverse right subtree
        preOrderTraversal(node.right);
    }

    // Method to perform preorder traversal
    void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public static void main(String[] args) {
        // Create a binary tree
        preorder tree = new preorder();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Preorder traversal of the binary tree:");
        tree.preOrderTraversal();
    }
}
