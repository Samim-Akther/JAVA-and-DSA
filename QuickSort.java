public class QuickSort {
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        Quicksort(arr,0,arr.length-1);
        printArr(arr);
           
       
        System.out.println();
    }
    public static void Quicksort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int pi=partition(arr, low, high);
        Quicksort(arr, low, pi-1);
        Quicksort(arr,pi+1,high);
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i = low-1;
        
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
            // Swap arr[i] and arr[j]
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
   // Swap arr[i+1] and arr[high] (or pivot)
    int temp=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=temp;
    return i+1;
    }

    public static void printArr(int arr[]){
        for (int i =0;i<arr.length;i++) {
           System.out.println(arr[i]+""); 
        }
    }
}
