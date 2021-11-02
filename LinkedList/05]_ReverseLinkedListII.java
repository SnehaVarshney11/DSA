
class ReverseLinkedListII {
    class ListNode{
        public ListNode next;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        ListNode pre = dummy;
        dummy.next = head;
        
        for(int i = 0; i < left-1; ++i)
            pre = pre.next;
        ListNode curr = pre.next;
        
        while(left++ < right){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }    
}
