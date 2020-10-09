import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Math;
public class First_Non_Repeating_Character {
    public static void fnrc(String s){
        HashMap<Character,Integer> map =  new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i))+1;
                map.put(s.charAt(i),count);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                System.out.println("First Non repeating character is :" +s.charAt(i));
                return;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you String : ");
        String input = sc.next();
        fnrc(input);
    }
}
