public int size(ListNode head){
        int count=0;
        ListNode t=head;
        while(t!=null){
            count++;
            t=t.next;
        }
        return count;
    } 

    public ListNode deleteNodes(ListNode head, int m, int n) {
        if(head==null) return null;
        if(m>=size(head)) return head;

        ListNode temp=head;
        ListNode ans=new ListNode(head.val);
        ListNode realAns=ans;
        
        while(temp!=null){
            int countm=1,countn=0;
            while(temp.next!=null && countm!=m){
                temp=temp.next;
                ans.next=new ListNode(temp.val);
                ans=ans.next;
                countm++;
            }
            while(temp.next!=null && countn!=n){
                temp=temp.next;
                countn++;
            }
            ans.next=temp.next;
            ans=ans.next;
            temp=temp.next;
        }
        return realAns;
    }