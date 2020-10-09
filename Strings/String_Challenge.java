 
import java.util.*;
import java.util.regex.Pattern;


class String_Challenge {

  public static void StringChallenge(String str) {
    // code goes here  
    StringBuilder sb = new StringBuilder();

    //finding break points
    List<Integer> l = new ArrayList<>();
    String pattern = "[a-zA-Z]";
    for(int i=0;i<str.length();i++){
      String curr = str.substring(i,i+1);
      if(!Pattern.matches(pattern,curr)){
        l.add(i);
      }
    }

    List<String> ls = new ArrayList<>();
    int left = 0;
    for (int i=0;i<l.size();i++){
      ls.add(str.substring(left,l.get(i)));
      left = l.get(i)+1;
    }
    ls.add(str.substring(left));
     sb.append(ls.get(0).substring(0,1).toLowerCase()).append(ls.get(0).substring(1).toLowerCase());
    for (int i=1;i<ls.size();i++){
      sb.append(ls.get(i).substring(0,1).toUpperCase()).append(ls.get(i).substring(1).toLowerCase());
    }
    System.out.println(sb.toString());


  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    StringChallenge("");

  }

}