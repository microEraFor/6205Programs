public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;

        /*After*/
        ListNode start=new ListNode(-1);
        start.next=head;
        ListNode pre=start;
        
        while(head!=null && head.next!=null){           
            ListNode first=head;
            ListNode second=head.next;

            pre.next=second;
            first.next=second.next;
            second.next=first;

            head=first.next;
            pre=first;
        }
        return start.next;
        
    }