class ListNode{

    public int val;
    public ListNode next;
    
}
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return null;
        
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        
        ListNode t1 = left;
        ListNode t2 = right;

        ListNode list = head;
        
        while(list != null){
            if(list.val < x){
                t1.next = list;
                t1 = t1.next;
            }else{
                t2.next = list;
                t2 = t2.next;
            }
            list = list.next;
        }
        t1.next = right.next;
        t2.next = null;
        
        return left.next;
    }
}
