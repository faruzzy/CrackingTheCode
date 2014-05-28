import java.lang.Math;

// Implement a method to determine if a tree is a valid binary search tree
public class PracticeProblem {


    public static void main(String[] args) {
        Node node = new Node(20);
        node.left = new Node(10);
        //node.right = new Node(30);
        node.left.left = new Node(9);
        node.left.right = new Node(15);

        System.out.println("Tree balanced: " + isBalanced(node));
    }

    public static boolean isBalanced(Node node) {

        if (checkHeight(node) == -1) return false;

        return true;
    }

    public static int checkHeight(Node node) {

        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return (Math.max(leftHeight, rightHeight) + 1);
    }
}

