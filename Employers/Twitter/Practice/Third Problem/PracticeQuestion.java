import java.lang.Math;

public class PracticeQuestion {

    public static void main(String[] args) {
        Node node = new Node(20);
        node.left = new Node(10);
        node.right = new Node(30);
        node.left.left = new Node(9);
        node.left.right = new Node(15);

        System.out.println("Tree balanced: " + isBalanced(node));
    }

    public static boolean isBalanced(Node node) {
        if (checkHeight(node) == -1) {
            return false;
        }
        return true;
    }

    public static int checkHeight(Node node) {
        // Node has a height of zero
        if (node == null) return 0;

        // Check if the left is balanced
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        // Check if the right is balanced
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        // Check if the curret node is balanced
        if (Math.abs(rightHeight - leftHeight) > 1) return -1;

        return Math.max(rightHeight, leftHeight) + 1;
    }
}
