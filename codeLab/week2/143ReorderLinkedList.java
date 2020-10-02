public void reorderList(ListNode head) {
        if(head==null) return;
        if(head.next==null) return;

        /*After*/
        List<ListNode> l=new ArrayList<>();
        while(head!=null){
            l.add(head);
            head=head.next;
        }
        int i=0,j=l.size()-1;
        while(i<j){
            l.get(i).next=l.get(j);
            i++;
            if(i==j){
                break;
            }
            l.get(j).next=l.get(i);
            j--;
        }
        l.get(i).next=null;
    }