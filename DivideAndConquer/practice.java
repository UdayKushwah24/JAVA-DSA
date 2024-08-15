package DivideAndConquer;

public class practice {
    public static void quicksorting(int arr[], int si , int ei) {
        if(si >= ei) {
            return ;
        }
        int pivotIndex = partition(arr, si, ei);
        quicksorting(arr, si, pivotIndex-1);   //for  Left part
        quicksorting(arr, pivotIndex+1, ei);   //for Right part
    }
    public static int partition(int arr[], int si, int ei) {
        int i = si-1; //make a place for those element which is less than pivot element
        int pivotel = arr[ei];
        for (int j = si; j < ei; j++) {
            if(arr[j]<=pivotel) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivotel;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quicksorting(arr, 0, arr.length-1);
        printArray(arr);
    }
}
