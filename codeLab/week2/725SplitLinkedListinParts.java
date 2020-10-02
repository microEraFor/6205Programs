public int size(ListNode l){
        int count=0;
        ListNode t=l;
        while(t!=null){
            t=t.next;
            count++;
        }
        return count;
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] ans=new ListNode[k];
        if(size(root)<=k){
            ListNode t=root;
            for(int i=0;i<k;i++){
                if(t!=null){
                    ans[i]=new ListNode(t.val);
                    t=t.next;
                }else{
                    ans[i]=null;
                }              
            }
            return ans;
        }
        int average=size(root)/k,remain=size(root)%k;
        ListNode temp=root;
        for(int j=0;j<k;j++){
            ListNode unitStart=new ListNode(-1);
            ListNode unit=unitStart;
            for(int m=0;m<average;m++){
                if(unit.val==-1){                   
                    unitStart=new ListNode(temp.val);
                    unit=unitStart;
                }else{
                    unit.next=new ListNode(temp.val);
                    unit=unit.next;
                }
                temp=temp.next;
            }
            if(remain!=0){
                unit.next=new ListNode(temp.val);
                remain--;
                temp=temp.next;
            }else{
                unit.next=null;
            }          
            ans[j]=unitStart;            
        }
        return ans;
    }