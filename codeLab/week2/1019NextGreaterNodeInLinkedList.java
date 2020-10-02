public int size(ListNode head){
        int count=0;
        ListNode t=head;
        while(t!=null){
            t=t.next;
            count++;
        }
        return count;
    }

    public int[] nextLargerNodes(ListNode head) {
         if(head==null) return null;
         int[] ans=new int[size(head)];
         if(head.next==null){
             ans[0]=0;
             return ans;
         }          
         ListNode t=head;
         int i=0,largest=0,check=0;
         while(t.next!=null){
             check=0;
             largest=t.val;
             ListNode tt=t.next;
             while(tt!=null){
                 if(tt.val>largest){
                    largest=tt.val;
                    check=1;
                    break;
                 }
                 tt=tt.next;
             }
             if(check==0){
                 ans[i]=0;
             } 
             else{
                 ans[i]=largest;
             } 
             i++;
             t=t.next;
         }
         return ans;
    }