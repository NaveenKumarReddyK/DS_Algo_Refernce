/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Deep_Copy {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node cloneHead = null;
        Node origHead = head;
        
        while(origHead != null){
            cloneHead = new Node(origHead.val);
            map.put(origHead,cloneHead);
            origHead = origHead.next;
        }
        
        origHead = head;
        while(origHead != null){
            cloneHead = map.get(origHead);
            cloneHead.next = map.get(origHead.next);
            cloneHead.random = map.get(origHead.random);
            origHead = origHead.next;
        }
        
        return map.get(head);
    }
}
