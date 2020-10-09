import java.util.*;
public class Replace_Words {
    public static String replaceWords(List<String> dict, String sentence) {
        String[] s = sentence.split(" ");
        HashMap<Character,ArrayList<String>> map = new HashMap<>();
        for(String l : dict){
            char c = l.charAt(0);
            if(!map.containsKey(c)){
                map.put(c,new ArrayList<String>());
                ArrayList<String> currList= map.get(c);
                currList.add(l);
                map.put(c,currList);
            }
            map.get(c).add(l);
        }
        for(int i=0;i<s.length;i++){
            String curr = s[i];
            ArrayList<String> list= map.get(curr.charAt(0));
            for(int j=1;j<curr.length();j++){
                if(list.contains(curr.substring(0,j)) == true){
                    s[i] = curr.substring(0,j);
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String curr:s ){
            sb.append(curr);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the cattle was rattled by the battery";
        List<String> l = new ArrayList<>();
        l.add("cat");
        l.add("bat");
        l.add("rat");
        System.out.println(replaceWords(l,s));
    }
}
