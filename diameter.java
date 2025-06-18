class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class BinaryTree {
    static class Diameter {
        int value;
    }
    private static int calculateHeight(TreeNode node, Diameter diameter) {
        if (node == null) {
            return 0;
        }
        int leftHeight = calculateHeight(node.left, diameter);
        int rightHeight = calculateHeight(node.right, diameter);
        diameter.value = Math.max(diameter.value, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static int getDiameter(TreeNode root) {
        Diameter diameter = new Diameter();
        calculateHeight(root, diameter);
        return diameter.value;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Diameter of the tree: " + getDiameter(root));
    }
}