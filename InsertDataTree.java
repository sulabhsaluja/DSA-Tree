public class InsertDataTree {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void insertData(TreeNode root, int value) {
        if (root == null)
            return;

        if (root.left == null) {
            root.left = new TreeNode(value);
        } else if (root.right == null) {
            root.right = new TreeNode(value);
        } else {
            insertData(root.left, value);  
        }
    }

    public static void printTree(TreeNode root) {
        if (root == null)
            return;

        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        insertData(root, 20);
        insertData(root, 30);
        insertData(root, 40);

        System.out.println("Inorder traversal of tree after insertions:");
        printTree(root);  
    }
}
