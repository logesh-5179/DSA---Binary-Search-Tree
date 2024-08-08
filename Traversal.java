class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class Traversal {

    public static void inorder(TreeNode key) {
        if (key != null) {

            inorder(key.left);
            System.out.print(key.value + " ");
            inorder(key.right);

        }
    }

    public static void preorder(TreeNode key) {
        if (key != null) {
            System.out.print(key.value + " ");
            preorder(key.left);
            preorder(key.right);
        }

    }

    public static void postorder(TreeNode key) {
        if (key != null) {
            postorder(key.left);
            postorder(key.right);
            System.out.print(key.value + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        System.out.println("Inorder: ");
        inorder(root);

        System.out.println("Preorder: ");
        preorder(root);

        System.out.println("Postorder: ");
        postorder(root);
    }
}