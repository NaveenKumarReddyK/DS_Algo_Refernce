import java.util.ArrayList;

public class FindMultipleOfNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5};
        int reqNum = 16;
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            int quotient = reqNum/arr[i];
            if(al.contains( quotient) && reqNum%arr[i] == 0){
                System.out.println(quotient+" "+arr[i]);
                break;
            }
            al.add(arr[i]);
            continue;
        }
        if(al.size() == arr.length){
            System.out.println("No such numbers exists");
        }
    }
}
