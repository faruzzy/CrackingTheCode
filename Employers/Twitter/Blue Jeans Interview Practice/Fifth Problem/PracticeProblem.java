// Implement a function to check if a tree is a valid BST
public class PracticeProblem {

    public static void main(String[] args) {
        Node node = new Node(20);
        node.left = new Node(10);
        node.left.left = new Node(5);
        node.left.right = new Node(12);

        node.right = new Node(30);
        node.right.left = new Node(25);
        node.right.right = new Node(40);

        System.out.println("Is a valid BST: " + validBST(node, 0, 100));
    }

    public static boolean validBST(Node node, int min, int max) {

        if (node == null) return true;

        if (node.value < min || node.value > max) return false;

        return validBST(node.left, min, node.value) && validBST(node.right, node.value, max);
    }

}
