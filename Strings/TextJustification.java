import java.util.*;

class TextJustificatoin{
    public static void fullJustify(String[] words, int maxWidth) {
        //add the lengths
        //check if teh next string sum is greater than maxwidth
        //if so stop and proceed with you helper function to make required string
        int sum = 0;

        int start = 0;
        List<String> res = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            sum+=words[i].length()+1;
            if(sum-1>maxWidth){//because there should be atleast one space
                String currStr = help_justify(words,start,i,maxWidth);
                res.add(currStr);
                sum = 0;
                start = i;
            }


        }
        //check if has reached to the end

        String lastOne = justify_Last(words,start,maxWidth);
        res.add(lastOne);
        System.out.println(lastOne);
//        return res;
//        for(String s : res){
//            System.out.println(s);
//        }
    }
    public static String help_justify(String[] arr,int start,int end,int width){
        StringBuilder sb  = new StringBuilder();
        int len = 0;
        int count = 0;
        for(int j=start;j<end;j++){
            len+=arr[j].length();
            count++;
        }

        int totalSpace = width - len;         //total space required
//        System.out.println("Total Space :"+totalSpace);
//        int spaceLen   = (count == 1) ? 0 : totalSpace/(count-1);//space between words
//        System.out.println("Spcae len : "+spaceLen);
        int spaceCount = (count == 1) ? 0 : totalSpace/(count-1); //number of spaces to be added
        System.out.println("Space count : "+spaceCount);
        int remSpace   = (spaceCount == 0) ? totalSpace : totalSpace%(count-1); //number of spaces remained after even distribution
        System.out.println("rem space : "+remSpace);

        for(int j=start;j<end-1;j++){
            sb.append(arr[j]);
            if(spaceCount >0){
                int currSpaceLen = count-1;
                while(currSpaceLen >0){
                    sb.append(" ");
                    currSpaceLen--;
                }
                spaceCount--;
            }

        }

        while(remSpace>0){
            sb.append(" ");
            remSpace--;
        }
        sb.append(arr[end-1]);
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static String justify_Last(String[] arr,int start,int width){
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for (int i=start;i<arr.length;i++){
            sb.append(arr[i]);
            len+=arr[i].length();
            if(len<width){
                sb.append(" ");
                len++;
            }
        }
        while (len<width){
            sb.append(" ");
            len++;
        }

        return sb.toString();
    }
    public static void main(String[] args){
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain", "to","a","computer.","Art","is","everything","else","we","do"};
        fullJustify(words,20);

    }//4,4,4,7
}