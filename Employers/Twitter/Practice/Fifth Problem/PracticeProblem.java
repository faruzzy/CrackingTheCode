// Write a method to validate that a tree is a BST
// If we perform an in order traversal on the tree all the elements should increases
public class PracticeProblem {

    public static void main(String[] args) {

        Node node = new Node(20);
        node.left = new Node(10);
        node.right = new Node(30);
        node.right.left = new Node(18);
        node.right.left.left = new Node(1);
        node.right.left.right = new Node(5000);
        node.left.left = new Node(1);
        node.left.right = new Node(15);

        System.out.println("Is valid BST: " + isValidBST(node, 0, 100000));
    }

    public static boolean isValidBST(Node node, int min, int max) {
        if (node == null) return true;

        if (node.value < min || node.value > max) return false;

        if (!isValidBST(node.left, min, node.value)
                || !isValidBST(node.right, node.value, max)) {
            return false;
        }
        return true;
    }

}
