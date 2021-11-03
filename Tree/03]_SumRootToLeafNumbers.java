class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        return helper(root, 0);
    }
    private int helper(TreeNode node, int curVal) {
        if (node == null) {
            return 0;
        }

        curVal = curVal * 10 + node.val;
        if (node.left == null && node.right == null) {
            return curVal;
        }

        return helper(node.left, curVal) + helper(node.right, curVal);
    }    
}
