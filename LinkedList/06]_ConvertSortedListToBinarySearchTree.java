package LinkedList;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    TreeNode left, right, next;
    int val;
}
class ListNode{
    int val;
}
class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        return helper(list, 0, list.size() - 1);
    }
    public static TreeNode helper(List<Integer> list, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        
        TreeNode node = new TreeNode(list.get(mid));
        
        node.left = helper(list, start, mid-1);
        node.right = helper(list, mid+1, end);
        
        return node;    
}
