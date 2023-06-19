//Leetcode 19
//Remove nth node from the end of the linked list

 
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode node = head;
        for(ListNode temp = head; temp.next!=null; temp = temp.next){
            size++;
        }
        if(size==1){
            head = null;
            return head;
        }
        if(n==size){
            head = head.next;
            return head;
        }
        for(int i = 0; i<size-n-1; i++){
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
}
