public class BubbleSort {
    
        public static void main(String[] args) {
            int arr[]={5,3,2,4,1};
            Bubblesort(arr);
            printarray(arr);
        }
        public static void Bubblesort(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        //swap
                        int temp =arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    
        public static void printarray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print (arr[i]+" ");
            }
        }
    }
    

