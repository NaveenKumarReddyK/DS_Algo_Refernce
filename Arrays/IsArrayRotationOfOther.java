public class IsArrayRotationOfOther {
    public static boolean isRotated(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        int key  = arr1[0];
        int index = -1;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] == key){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        int j = 0;
        for(int i=0;i<arr2.length;i++){
            j = (index+i)%(arr2.length);
            if(arr1[i] != arr2[j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,1,2,3};

       if(!isRotated(arr1,arr2)){
           System.out.println("Not rotated array");
       }
       else{
           System.out.println("Rotated array");
       }
    }
}
