//Link : https://leetcode.com/problems/insertion-sort-list/

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
class Solution {
    public ListNode insertionSortList(ListNode head) {
        //base case 
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head; 
        ListNode preNode = dummyHead;
        ListNode insertNode = dummyHead;
        while(head != null && head.next != null){
            if(head.val <= head.next.val){
                //in ascending order , no need to change
                head = head.next;
            }
            else{
                //move the prenode to the start of the dummyhead
                preNode = dummyHead;
                //the node to insert in its correct position is the node next to the actual head
                insertNode = head.next;
                //find the pos to insert the current node (insertNode) by checking if pre node values are less than the value of the node to be inserted
                while(preNode.next.val < insertNode.val){
                    preNode = preNode.next;
                }
                //now next of the pre node is the place where the cuurent node (insertNode) to be inserted
                //connect the original head to next of insertion node to break the node from the list and to add it in correct position
                head.next = insertNode.next;
                //connect next of insertion node to to pre node 
                insertNode.next = preNode.next;
                //finally connect the next of pre node to add the insertion node into list
                preNode.next = insertNode;
            }
        }
        return dummyHead.next;
    }
}
		
		return helper.next;
    }
}
