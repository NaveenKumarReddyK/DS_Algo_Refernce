/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Merge_K_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0){
            return null;
        }
        //add all the linked list heads to priority queue
        //bfs
        
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->(a.val - b.val));
        for(ListNode node_head : lists){
           if(node_head != null){
                q.add(node_head);
           }
        }
        //check if the list is empty
        if(q.isEmpty()){
            return null;
        }
        ListNode head = q.peek();//linked list head
        while(!q.isEmpty()){
            ListNode curr = q.poll();
            if(curr.next != null){
                q.add(curr.next);
            }
            if(q.peek() != null){
                curr.next = q.peek();
            }
        }
        return head;
    }
}
