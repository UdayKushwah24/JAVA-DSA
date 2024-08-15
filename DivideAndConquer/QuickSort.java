package DivideAndConquer;

public class QuickSort {
    public static void quicksort(int arr[],int si,int ei) {
        //Base case
        if(si >= ei) {
            return;
        }
        //Pivot element --> last element 
        int pivotInd = partition(arr,si,ei);
         
        quicksort(arr, si, pivotInd-1);   //Left Part
        quicksort(arr, pivotInd+1, ei);   //Right Part
    }
    public static int partition(int arr[],int si, int ei) {
        int i = si-1;  //to make place for elements smaller than pivot element

        int pivotelement = arr[ei];
        for (int j = si; j < ei; j++) {
            if(arr[j] <= pivotelement) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }

        //to place a pivot element at a correct place
        i++;
        int temp = pivotelement;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,-5};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
