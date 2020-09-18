/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {

        if(head==null){
            Node newNode=new Node(insertVal,null);
            newNode.next=newNode; 
            return newNode;         
        }
        
        Node pre=head;
        Node cur=head.next;
        Node newNode=new Node(insertVal,null);
        while(cur!=head){
            if(pre.val<=insertVal && insertVal<=cur.val){
                break;
            }else if(insertVal>=pre.val && insertVal>cur.val && cur.val<pre.val){
                break;
            }else if(insertVal<=cur.val && insertVal<pre.val && cur.val<pre.val){
                break;
            }else{
                pre=cur;
                cur=cur.next;
            }
            
        }
        newNode.next=cur;
        pre.next=newNode;
        return head;
    }
}