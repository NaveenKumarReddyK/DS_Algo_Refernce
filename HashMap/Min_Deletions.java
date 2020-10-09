// Minimum deletions to make frequency of each letter unique
public class Min_Deletions {
    public static int makeUnique(String s) {
        if (s.length() <= 1) {
            return 0;
        }

        //counting character frequencies
        HashMap < Character, Integer > map = new HashMap < > ();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //get Max of frequencies
        PriorityQueue < Integer > queue = new PriorityQueue < Integer > (Collections.reverseOrder());

        for (Map.Entry < Character, Integer > m: map.entrySet()) {
            queue.add((int) m.getValue());
        }

        int change_count = 0;

        //we need to get number in ascending order
        //so if the popped value and peeked value are same
        //remove 1 from the popped value and add into the priority queue
        while (!queue.isEmpty()) {

            int max_freq = (int) queue.poll();
            if (queue.size() == 0) {
                return change_count;
            }
            if (max_freq == (int) queue.peek()) {
                //check if the popped item is greater than one
                //it is because whe cannot have zero characters in a string

                if (max_freq > 1) {
                    max_freq--;
                    queue.add(max_freq);
                }
                //increment the change count for every condition check
                change_count++;

            }
        }
        return change_count;
    }
    public static void main(String[] args) {
        //Minimum deletetion required to make a string unique

        String s = "ccaaffddecee";
        System.out.println(makeUnique(s));
    }
}
