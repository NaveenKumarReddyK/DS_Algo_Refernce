public class MinSwapsToMakePalindrome {
    public static int minSwaps(String s){
        if(s.length() == 0){
            return -1;
        }
        else if(s.length() == 1){
            return 0;
        }
        int len = s.length();
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<len/2;i++){
             int front = i;
             int rear = len-i-1;
             while (front<rear){
                 if (arr[front] == arr[rear]){
                     break;
                 }
                 else {
                     rear--;
                 }
                 //found same element
             }
             if (front == rear){
                 return -1;
             }
             else {
                 for (int j=rear;j<len-front-1;j++){
                     char temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     count++;
                 }
             }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "naveenav";
        int swaps = minSwaps(input);
        if( swaps== -1){
            System.out.println("String cannot be made into palindorme");
        }
        else {
            System.out.println("No of swaps :"+swaps);
        }
    }
}
