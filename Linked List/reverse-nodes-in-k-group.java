 //https://leetcode.com/problems/reverse-linked-list-ii/
 public ListNode reverseKGroup(ListNode head, int k) {
        //same as reverse linked list from mth pos to nth pos
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int start = 1;
        int end = k;
        while(end <= len){
            head = reverseFrom_M_to_N(head,start,end);
            start+=k;
            end+=k;
        }
        return head;
    }
    
    public ListNode reverseFrom_M_to_N(ListNode head,int m,int n){     
        ListNode middle = head;  
        ListNode middleHead = null;  
        
        while(m > 1){
            middleHead = middle;
            middle = middle.next;
            m--;
            n--;
        }
        ListNode firstTail = middleHead;
        ListNode middleTail = middle;
        ListNode lastHead = null; 
        
      
        while(n != 0){
            lastHead = middle.next;
            middle.next = middleHead;
            middleHead = middle;
            middle = lastHead;
            n--;
        }
        if(firstTail != null){
            firstTail.next = middleHead;
        }
        else{
            head = middleHead;
        }
        middleTail.next = lastHead;
        return head;
    }
