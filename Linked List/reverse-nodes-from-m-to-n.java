//https://leetcode.com/problems/reverse-linked-list-ii/
public ListNode reverseBetween(ListNode head, int m, int n) {
        //traverse to tail of first par(1 to m-1) 
        //reverse the m to n part
        //connect head of middle part to tail of first part
        //connect tail of middle part to head of remaining part
        
        ListNode middle = head; // head of second part
        ListNode middleHead = null; //tail of first part
        
        while(m > 1){
            middleHead = middle;
            middle = middle.next;
            m--;
            n--;
        }
        ListNode firstTail = middleHead;//head of curr start of middle node to be connected to head of third part
        ListNode middleTail = middle;//curr middle head becomes tail after reversing
        ListNode lastHead = null;//head of middle part (after reversing)
        
         //reverse middle
        while(n != 0){
            //We donot use temp node to store next pointer because
            //we need to keep track of curr middle head
            lastHead = middle.next;
            middle.next = middleHead;
            middleHead = middle;
            middle = lastHead;
            n--;
        }
        
        //check if the firstTail is null (head of linked list)
        if(firstTail != null){
            firstTail.next = middleHead;
        }
        else{
            //if firstTail is null then there are no nodes Prior to the Original head
            //so we make the head as prev
            head = middleHead;
        }
        
        //connect tail of middle part to head of last part
        middleTail.next = lastHead;
        return head;
    }
Brief Explaination of Algorithm

1->2->3->4->5->NULL    m = 2, n = 4
1 ##  2->3->4  ## 5->NULL

Before Reversing                                               After Reversing 
middleHead => 1                                                middleHead => 4->+++
firstTail => 1                                                 firstTail => 1
middle => 2->+++                                               middle => 5->NULL
middleTail => 2->+++                                           middleTail => 2
lastHead => NULL                                               lastHead => 4

firstTail.next  = middleHead
middleTail.next = lastHead
