/**
 * Write a method to create a binary search tree with the smallest height
 * given a sorted array.
 */
TreeNode createMinimalBST(int[] array, int start, int end) {
	if (end < start) return null;

	int mid = (start + end) / 2;
	TreeNode n = new TreeNode(arr[mid]);
	n.left = createMinimalBST(array, start, mid - 1);
	n.right = createMinimalBST(array, mid + 1, end);
	return n;
}

TreeNode createMinimalBST(int[] array) {
	return createMinimalBST(array, 0, array.length - 1);
}