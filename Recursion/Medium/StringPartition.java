package Recursion.Medium;

public class StringPartition {
    // Partition of String
    public static void Partition(String str, String partition) {
        if(str.length() == 0) {
            System.out.println(partition);
            // System.out.println(partition.substring(0,partition.length()-1));
            return;
        }
        for (int i = 1; i <= str.length(); i++) {
            String s = str.substring(0, i);
            Partition(str.substring(i), partition + s+"|");
        }
    }

    public static void main(String[] args) {
        String str = "nitin";
        Partition(str,"");
    } 
}
