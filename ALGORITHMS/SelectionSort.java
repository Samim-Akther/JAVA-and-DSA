public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,7};
        
        Selectionsort(arr);
        printArr(arr);
    }
    public static void Selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min =j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}