 package Modeul5_recrstion;

class print_Incriction {

    public static void main(String[] args) {
        PrintIncreasing(10);
    }
    public static void PrintIncreasing(int n){
        if(n==0){
            return;
        }
        PrintIncreasing(n-1);
        System.out.println(n);
    }
}