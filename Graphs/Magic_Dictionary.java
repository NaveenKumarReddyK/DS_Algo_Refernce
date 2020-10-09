
class Magic_Dictionary {
    TrieNode root;
    class TrieNode{
        public TrieNode[] child;
        public boolean isEnd;
        TrieNode(){
            child = new TrieNode[26];
            for(int i=0;i<26;i++){
                child[i] = null;
            }
            isEnd = false;
        }
    }
    /** Initialize your data structure here. */
    public Magic_Dictionary() {
        root = new TrieNode();
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String s: dict){
            TrieNode node = root;
            for(char c : s.toCharArray()){
                int num = c - 'a';
                if(node.child[num] == null){
                    node.child[num] = new TrieNode();
                }
                node = node.child[num];
            }
            node.isEnd = true;
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        TrieNode node = root;
     
        int changeCount = 0;
        for(int i=0;i<word.length();i++){
            int num  = word.charAt(i) - 'a';

            if(node.child[num] == null){
                TrieNode tempNode = node.child[num];
                //check if it points by cross checking all
                for(int j=0;j<26;j++){
                    if(node.child[j] != null){
                        node = node.child[j];
                        changeCount++;
                        i++;
                        break;
                    }

                }
                if(node == tempNode){
                    changeCount++;//end of string
                    i++;
                }

            }
            else{
                node = node.child[num];
            }
        }

        return node.isEnd && changeCount == 1;
    }

    public static void main(String[] args) {


          Magic_Dictionary obj = new Magic_Dictionary();
          String[] dict = {"hello", "leetcode"};
          obj.buildDict(dict);
          String word = "hello";
        System.out.println(obj.search(word));
    }
}

