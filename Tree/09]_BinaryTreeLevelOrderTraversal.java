import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left, right;
    
}

class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;
    }
    private void helper(List<List<Integer>> res, TreeNode root, int height){
        if(root == null)
            return;
        if(height >= res.size())
            res.add(new LinkedList<Integer>());
        res.get(height).add(root.val);
        helper(res, root.left, height+1);
        helper(res, root.right, height+1);
    }
}
