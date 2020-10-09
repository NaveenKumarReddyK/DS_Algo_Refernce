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
class Sort_LinkedList {
    public ListNode sortList(ListNode head) {
        //perform merger sort on heads
        //divide linked list into two parts
        //divide into two halfes
        //call sort recursively
        //merge them
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;//to divide the linked list
        while(fast != null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; //making the next node null breaks the linked list
        
        ListNode leftPart = sortList(head);
        ListNode rightPart = sortList(slow);
        
        return merge_util(leftPart,rightPart);
         
    }
    
    public ListNode merge_util(ListNode left,ListNode right){
        ListNode dummy_head = new ListNode(0);
        ListNode temp_head = dummy_head;
        
        while(left != null && right != null){
            if(left.val < right.val){
                temp_head.next = left;
                left = left.next;
            }
            else{
                temp_head.next = right;
                right = right.next;
            }
            temp_head = temp_head.next;
        }
        
        //check for remained nodes
        while(left != null){
            temp_head.next = left;
            left = left.next;
            temp_head = temp_head.next;
        }
        while(right != null){
            temp_head.next = right;
           right = right.next;
            temp_head = temp_head.next;
        }
        
        return dummy_head.next;
    }
}
