public static int checkHeight(Node node){
	if (node == null) return 0;

	int leftHeight = checkHeight(node.left);
	if (leftHeight == -1) return -1;

	int rightHeight = checkHeight(node.right);
	if (rightHeight == -1) return -1;

	int heightDifference = rightHeight - leftHeight;

	if (heightDifference > 1) return -1;

	return Math.max(rightHeight, leftHeight) + 1;

}

public static boolean isBalanced(Node node) {

	int heightCheck = checkHeight(node);
	if (heightCheck == -1) return false;

	return return true;
}