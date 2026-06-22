package Modeul4;

public class selection_sort {
    public static void main(String[] args) {
        int [] arr={2,1,4,-1,5,7,9,0};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
       for(int i=0;i<arr.length-1;i++){
        int minVal=arr[i];
        int minInd=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<minVal){
            
            minVal=arr[j];
            minInd=j;

             }
             
        }
        int temp=arr[i];
        arr[i]=arr[minInd];
        arr[minInd]=temp;
        
       }
       for (int i : arr) {
        System.out.println(i);
       }
    }
}
