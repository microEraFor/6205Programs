public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        int count=3;
        ListNode temp=head;
        ListNode jiAns=new ListNode(temp.val);
        ListNode ouAns=new ListNode(temp.next.val);
        temp=head.next.next;
        ListNode jiBegin=jiAns;
        ListNode ouBegin=ouAns;
        
        while(temp!=null){
            if(count%2!=0){
                jiAns.next=new ListNode(temp.val);                
                jiAns=jiAns.next;
            }else{               
                ouAns.next=new ListNode(temp.val);                 
                ouAns=ouAns.next;
            }
            count++;
            temp=temp.next;
        }
        jiAns.next=ouBegin;       
        return jiBegin;
    }