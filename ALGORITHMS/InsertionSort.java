public class InsertionSort {
    
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1,7};
        insertionsort(arr);
        printarray(arr);
    }

    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp =arr[i];
            int j =i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            } 
            arr[j]=temp;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print (arr[i]+" ");
        }
    }

}
