// Link : https://leetcode.com/problems/reconstruct-itinerary/

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        //put all the tickets into hashmap
        //order those to places in ascending order
        HashMap<String,PriorityQueue<String>> map =  new HashMap<>();
        for(List<String> ticket : tickets){
            map.putIfAbsent(ticket.get(0),new PriorityQueue<String>());
            map.get(ticket.get(0)).offer(ticket.get(1));
        }
        //res list
        List<String> res = new ArrayList<>();
        //use stack to traverse through all the to tickets
        Stack<String> stack = new Stack<>();
        //add JFK to stack
        stack.push("JFK");
        while(!stack.isEmpty()){
            //check if map has curr val and priorityqueue is not empty
            while(map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()){
                //push tickets to stack
                stack.push(map.get(stack.peek()).poll());
            }
            //after reching end add curr dest at top of stack to res
            res.add(0,stack.pop());
        }
        
        return res;
    }
}
