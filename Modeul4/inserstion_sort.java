package Modeul4;
public class inserstion_sort {
    public static void main(String[] args) {
        int arr[]={8,6,5,7,5,4,3,0,-1};
        insertionSort(arr);
    }
    public  static void insertionSort(int []arr){
 
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
