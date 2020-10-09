//Each node consists of an arr of szie 26

import javax.swing.tree.TreeNode;

class Trie{
    static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfChild;
        TrieNode(){
              isEndOfChild = false;
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static TrieNode root;

    public static void insert(String s){

        int len = s.length();
        TrieNode currNode = root;
        for (int level = 0;level<len;level++){
            int currVal = s.charAt(level) - 'a';//subtract 95
            if(currNode.children[currVal] == null){
                currNode.children[currVal] = new TrieNode();
            }
            currNode = currNode.children[currVal];//Move the pointer
        }
        //Mark the end as ture i.e, it has reached the end if children node
        currNode.isEndOfChild = true;
    }
    public static boolean search(String s){
         if(s.charAt(0) == '.'){
             int startIndex = 0;
             for(int i=0;i<s.length()-1;i++){
                 if(s.charAt(i) == '.' && s.charAt(i+1) != '.'){
                     String newString = s.substring(i+1);
                     return searchUtil(newString);
                 }
             }
         }
         else if(s.charAt(s.length()-1) == '.'){
             int endIndex = 0;
             for(int i=s.length()-1;i<0;i++){
                 if(s.charAt(i) == '.' && s.charAt(i-1) != '.'){
                     String newString = s.substring(0,i-1);
                     return searchUtil(newString);
                 }
             }
         }
         return searchUtil(s);

}
public static boolean searchUtil(String s){
    TrieNode currNode = root;

    int len = s.length();
    for (int level=0;level<s.length();level++){
        int currVal = s.charAt(level) - 'a';
        if(currNode.children[currVal] == null){
            return false;
        }
        currNode = currNode.children[currVal];
    }
    //chech if it is end of the child
    return (currNode != null && currNode.isEndOfChild);
}


    public static void main(String[] args) {
        Trie trie = new Trie();
        root = new TrieNode();
        String[] arr = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};
        for(String s:arr){
            trie.insert(s);
        }
        String findString = "ther.";
        if(trie.search(findString)){
            System.out.println("Sring found");
        }
        else {
            System.out.println("String not found");
        }
    }
}

