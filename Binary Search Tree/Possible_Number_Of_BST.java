import java.util.Scanner;

public class Possible_Number_Of_BST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num+1];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2;i<=num;i++){
            for(int j=0;j<i;j++){
                arr[i]+=arr[j]*arr[i-j-1];
            }
        }
        System.out.println(arr[num]);
    }
}
