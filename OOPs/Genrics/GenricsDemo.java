package OOPs.Genrics;

public class GenricsDemo {
    
  /*   public static void main(String[] args) {
        String[] arr = {"Ankit", "Ankita", "Kaju", "Amisha","Raj","Vidhal","Pooja"};
        Display(arr);
        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        // int arr ke liye dusra display method likhna padhega
        Display(arr1);
    }

    public static void Display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } */

      
   
    public static void main(String[] args) {
        String[] arr = {"Ankit", "Ankita", "Kaju", "Amisha", "Raj", "Vidhal", "Pooja"};
        display(arr);

        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        display(arr1);
    }

    // Generic display method
    public static <T> void display(T[] arr) {  // <T> declare kar diya
        for (T element : arr) {
            System.out.println(element);
        }
        System.out.println();
    }
}
