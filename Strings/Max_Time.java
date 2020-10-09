public class Max_Time {
    public static String time(String s){
        char[] arr = s.toCharArray();
        arr[4] = (arr[4] == '?') ? '9' : arr[4];
        arr[3] = (arr[3] == '?') ? '5' : arr[3];
        if(arr[1] == '?' && arr[0] == '?'){
            arr[0] = '2';arr[1] = '3';
        }
        else if(arr[1] != '?' && arr[0] == '?'){
            arr[0] = (arr[1] <= 3) ? '2' : '1';
        }
        else if(arr[1] == '?' && arr[0] != '?'){
            arr[1] = (arr[0] != '2') ? '9' : '1';
        }
        String res = new String(arr);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(time("?4:5?"));
    }
}
