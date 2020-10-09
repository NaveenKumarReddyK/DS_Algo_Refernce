import java.util.Stack;
public class ReverseSentence {
    public static void reverseSentence(String s){
        Stack<Character> sh = new Stack<Character>();
        for(int i=0;i<s.length();++i){
            if(s.charAt(i) != ' '){
                sh.push(s.charAt(i));
            }
            else{
                while(!sh.isEmpty()){
                    System.out.println(sh.pop());
                }
                System.out.println(" ");

            }
        }
        while(!sh.isEmpty()){
            System.out.println(sh.pop());
        }

    }
    public static void main(String[] args){
        String s = "I am Naveen";
        reverseSentence(s);
    }
}
