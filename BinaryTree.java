class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
class BinaryTree {
    // Root of the binary tree
    TreeNode root;

    BinaryTree() {
        root = null;
    }

    // Method to perform post-order traversal recursively
    void postOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        // Traverse left subtree
        postOrderTraversal(node.left);

        // Traverse right subtree
        postOrderTraversal(node.right);

        // Visit the current node
        System.out.print(node.val + " ");
    }

    // Method to perform post-order traversal
    void postOrderTraversal() {
        postOrderTraversal(root);
    }

    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Post-order traversal of the binary tree:");
        tree.postOrderTraversal();
    }
}
