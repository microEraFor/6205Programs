    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode pre=new ListNode(-1);
        ListNode cur=head;
        pre.next=head;
        ListNode start=pre;
        while(cur!=null){
            if(cur.val==val){
                if(cur.next==null){
                    pre.next=null;
                    break;
                }
                pre.next=cur.next;
                cur=cur.next;
            }
            else{
                pre=pre.next;
                cur=cur.next;
            }
        }
        return start.next;
    }