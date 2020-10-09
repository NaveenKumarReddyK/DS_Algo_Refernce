import java.util.*;
public class Pascal_Number {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        if(numRows == 0){
            return res;
        }
        else if(numRows == 1){
            l.add(1);
            res.add(0,l);
            return res;
        }
        else if(numRows == 2){
            l.add(1);
            res.add(0,l);
            l.add(1);

            res.add(1,l);
            return res;
        }
        l.add(1);
        res.add(0,l);
        l.add(1);
        res.add(1,l);

        for(int i=2;i<numRows;i++){
            List<Integer> prevList = res.get(i-1);
            List<Integer> currList = new ArrayList<Integer>();
            currList.add(1);
            int prevLen  = prevList.size();
            for(int j=0;j<prevLen-1;j++){
                currList.add(prevList.get(j)+prevList.get(j+1));
            }
            currList.add(1);
            res.add(i,currList);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(2));
    }
}

