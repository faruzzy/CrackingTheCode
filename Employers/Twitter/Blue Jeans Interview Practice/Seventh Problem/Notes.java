public class TreeTraversal {

    public void preOrderTraversal(Node n) {
        if (n == null) return;

        process(n);
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    public void postOrderTraversal(Node n) {
        if (n == null) return;

        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        process(n);
    }

    public void inOrderTraversal(Node n) {
        if (n == null) return;

        inOrderTraversal(n.left);
        process(n);
        inOrderTraversal(n.right);
    }

    public void breadthFirstSearch(Node n, int findMe) {
        Queue<Node> q = new Queue<Node>();
        q.enqueue(n);

        while (n != null) {
            Node n = queue.dequeue();
            // Typically this is wher the visit logic goes
            if (n.value = findMe) {
                 return n;
            }
            if (n.left != null) queue.add(n.left);
            if (n.right !=null) queue.add(n.right);
        }
}
