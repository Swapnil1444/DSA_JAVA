package Modeul4;
public class bubble_sort{
    public static void main(String[] args) {
        int arr[]={4,5,2,1,-1,7,0};
        bubbleSort(arr);
    }
    public static void bubbleSort(int []arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}