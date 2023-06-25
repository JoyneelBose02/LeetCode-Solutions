//Leetcode 2181
//Merge nodes between zeros

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode sol = new ListNode(0);
        ListNode temp = head;
        ListNode node = sol;
        int sum = 0;
        while(temp != null){
            if(temp.val == 0){
                ListNode mid = new ListNode(sum);
                node.next = mid;
                node = node.next;
                sum = 0;
                temp = temp.next;
            }
            else{
                sum += temp.val;
                temp = temp.next;
            }
        }
        return sol.next.next;
    }
}