package LinkedList;

class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode temp = head;
        
        while(temp != null){
            ListNode next = temp.next;
            ListNode start = head;
            ListNode prev = head;
            
            while(start != next){
                if(start.val > temp.val){
                    temp.next = start;
                    if(start == head){
                        head = temp;
                    }else{
                        prev.next = temp;
                    }
                    while(start.next != temp){
                        start = start.next;
                    }
                    start.next = next;
                }
                prev = start;
                start = start.next;
            }
            temp = next;
        }
        return head;
    }    
}
