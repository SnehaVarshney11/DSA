package Stack;

import java.util.ArrayList;

class TreeNode{
    TreeNode left, right;
    int val;
}

class BSTIterator {
    int i;
    ArrayList<Integer> al = new ArrayList<>(); 
    public BSTIterator(TreeNode root) {
        i = -1;
        inOrder(root);
    }
    
    public int next() {
        i++;
        int n = al.get(i);
        return n;
    }
    
    public boolean hasNext() {
        return(i+1<al.size()) ? true : false;
    }
    
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        al.add(root.val);
        inOrder(root.right);
    }    
}
