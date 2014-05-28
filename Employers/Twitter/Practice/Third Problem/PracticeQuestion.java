import java.lang.Math;

// Determine if a binary search tree is balanced
public class PracticeQuestion {

    public static void main(String[] args) {
        Node node = new Node(20);
        //node.left = new Node(10);
        //node.left.left = new Node(5);
        //node.left.right = new Node(12);

        node.right = new Node(30);
        node.right.left = new Node(25);
        node.right.right = new Node(40);

        isBalanced(node);
    }

    public static void isBalanced(Node node) {
        if (checkHeight(node) == -1) System.out.println("Not balanced.");
        else System.out.println("Balanced.");
    }

    public static int checkHeight(Node node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(rightHeight - leftHeight) > 1) return -1;

        return Math.max(rightHeight, leftHeight) + 1;
    }
}
