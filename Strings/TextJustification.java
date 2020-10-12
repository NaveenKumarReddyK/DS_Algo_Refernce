class Solution {
    public List<String> fullJustify(String[] words, int maxLen) {
        List<String> ans = new ArrayList<>();
        List<String> tempList = new ArrayList<>();  //to store the words that can be put in one same line
        int tempLen = 0;     // track the length of current line: wordsLen + spaces between words
        int index = 0;      //index of word in words array
        int wordsLen = 0;   // sum of all words that can be put in same line
        int spaces = 0;     // sapces that need to be filled
        
        while(index < words.length) {
            if((tempLen + words[index].length()) <= maxLen) {   //check if cur word can be put in cur line
                tempLen += words[index].length() + 1;
                tempList.add(words[index++]);
            }else {
                StringBuilder sb = new StringBuilder();
                wordsLen = tempLen - tempList.size();
                spaces = maxLen - wordsLen;
                if(tempList.size() == 1) {          // there's only one word at cur line, then just fill the spaces
                    sb.append(tempList.get(0));
                    for(int i = 0; i < spaces; i++) {
                        sb.append(" ");
                    }
                    ans.add(sb.toString());
                }else if(tempList.size() > 1){      // there's many words in cur line, do the evenly spaceing
                    int distance = spaces / (tempList.size() - 1);
                    int reminder = spaces % (tempList.size() - 1);
                    
                    for(int i = 0; i < tempList.size() - 1; i++) {
                        sb.append(tempList.get(i));
                        if(reminder > 0){
                            sb.append(" ");
                            reminder--;
                        }
                        for(int j = 0; j < distance; j++)
                            sb.append(" ");
                    }
                    sb.append(tempList.get(tempList.size() - 1));
                    ans.add(sb.toString());   
                }
                tempList.clear();  
                tempLen = 0;
            }
        }
        
        // dealing with last line
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tempList.size() - 1; i++) {
            sb.append(tempList.get(i));
            sb.append(" ");
        }
        sb.append(tempList.get(tempList.size() - 1));
        for(int i = 0; i < maxLen - (tempLen - 1); i++)
                  sb.append(" ");
        ans.add(sb.toString());
        return ans;
        
    }
}
