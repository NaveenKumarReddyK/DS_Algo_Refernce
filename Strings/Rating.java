import javax.swing.*;
import java.util.*;
public class Rating {
    public static String StringChallenge(String str) {
        // code goes here

        int intpart = Integer.parseInt(str.substring(0,1));
        int decpart = Integer.parseInt(str.substring(2));
        StringBuilder sb = new StringBuilder();

       String[] arr = new String[5];
       int i=0;
       while(i<5 && intpart>0){
           arr[i] = "full";
           i++;
           intpart--;
       }
       if(decpart<=50 && i<5){
           arr[i] = "half";
           i++;
       }
       else{
           arr[i] = "full";
           i++;
       }
       while(i<5){
           arr[i] = "empty";
           i++;
       }

       for (String s : arr){
           System.out.println(s);
       }
        System.out.println(intpart+" "+decpart);

       return "";

    }

    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(StringChallenge(s.nextLine()));
        System.out.println(StringChallenge("0.29"));
    }
}
