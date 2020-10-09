import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class HasUnique {
    public static boolean isUnique(String s){
        ArrayList<Character> arl = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(arl.size() == 0){
                arl.add(c);
            }

            else if(arl.contains(c)){
                return false;
            }
            arl.add(c);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isUnique(s)){
            System.out.println("String is unique");
        }
        else{
            System.out.println("String is not unique");
        }


    }
}
