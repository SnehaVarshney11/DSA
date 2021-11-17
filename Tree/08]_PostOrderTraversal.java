import java.util.LinkedList;
import java.util.List;


class TreeNode{
    int val;
    TreeNode left, right;
    public TreeNode(int item)
    {
        val = item;
        left = right = null;
    }
}

class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if(root == null) return list;
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }    
}
