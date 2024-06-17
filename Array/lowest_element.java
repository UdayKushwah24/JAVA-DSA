package Array;

public class lowest_element {
    public static void main(String[] args) {
        int[] my_array = {7, 12, 9, 4, 11};
        int minVal = my_array[0];

        for(int i=0;i<my_array.length;i++){
                if(my_array[i]<minVal){
                minVal = my_array[i];
            }
        }
        System.out.println("Lowest value: " + minVal);
    }
}
    

