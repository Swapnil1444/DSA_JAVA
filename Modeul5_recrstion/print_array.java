package Modeul5_recrstion;

public class print_array {
    public static void main(String[] args) {
        int []arr={30,29,44,11,34,56,30,33,22,222,222,22,22222};
        printArray(arr,0);
    }
    public static void printArray(int []arr,int i){
        if(i==arr.length){
            return; 
            
        }
        System.out.println(arr[i]);
        printArray(arr, i+1);
    }
}
