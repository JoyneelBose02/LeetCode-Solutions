//Leetcode 82
//Remove Duplicates from sorted list II
import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(map.containsKey(temp.val)){
                map.put((temp.val),map.get(temp.val)+1);
            }
            else{
                map.put(temp.val,1);
            }
            temp = temp.next;
        }
        ListNode node = new ListNode(0);
        ListNode final_node = node;
        int val = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue()==1){
                val = (int)entry.getKey();
                list.add(val);
            }
        }
        Collections.sort(list);
        for(int i = 0; i<list.size();i++){
            ListNode iter = new ListNode(list.get(i));
            final_node.next = iter;
            final_node = final_node.next;
        }
        System.out.println(map);
        return node.next;
    }
}