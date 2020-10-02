public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        Set<Integer> set=new HashSet<>();
        ListNode t=head;
        while(t.next!=null){
            if(t.val==t.next.val){
                set.add(t.val);
            }
            t=t.next;
        }
        ListNode ans=new ListNode(-1);
        ListNode realAns=ans;
        t=head;
        while(t!=null){
            if(!set.contains(t.val)){
                realAns.next=new ListNode(t.val);
                realAns=realAns.next;
            }
            t=t.next;
        }
        return ans.next;
    }