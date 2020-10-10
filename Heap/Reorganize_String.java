class Pair{
    char c;
    int count;
    Pair(char c , int count){
        this.c = c;
        this.count = count;
    }
}
class Reorganize_String {
    public String reorganizeString(String S) {
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->(
        a.count == b.count ? a.c - b.c : b.count - a.count
        ));
        int len = S.length();
        int[] count = new int[26];
       for(char c : S.toCharArray()){
            count[c - 'a']++;
        }
       for(int i=0;i<26;i++){
           if(count[i]>0){
               if(count[i]>(len+1)/2){
                   return "";
               }
               q.offer(new Pair((char) ('a' + i),count[i]));
           }
       }
        StringBuilder res = new StringBuilder();
        //we need to add two chars at a time
        while(q.size() >= 2){
            Pair first = q.poll();
            Pair second = q.poll();
            res.append(first.c);
            res.append(second.c);
            first.count--;
            second.count--;
            if(first.count > 0){q.offer(first);}
            if(second.count > 0){q.offer(second);}
        }
        
        //check if any char remains
        if(q.size()>0){
            res.append(q.poll().c);
        }
        
        return res.toString();
    }
}
