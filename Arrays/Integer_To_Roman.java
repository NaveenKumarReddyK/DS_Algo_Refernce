//Link : https://leetcode.com/problems/integer-to-roman/

import java.util.*;

class Integer_to_Roman_General{ 
        //get all the numbers from 1 to 1000 where the changes occurs (Eg. 40 => XL )
        static int[] divStore = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        static String[] romanStore  = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static String intToRoman(int num){
       
        //first get the leading number multiple and recursively subtract and add it to result
        //recusrsively call numbers
        return getRoman(num);
    }
    public static String getRoman(int num){
        //base case
        if(num == 0){
            return "";
        }
        int index = getDiv(num);
        return romanStore[index] + getRoman(num - divStore[index]);
    }
    public static int getDiv(int num){
        //traverse through numstore
        for(int i=0;i<divStore.length;i++){
                if(num/divStore[i] != 0){
                    return i;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(intToRoman(num));
        sc.close();
    }
}
