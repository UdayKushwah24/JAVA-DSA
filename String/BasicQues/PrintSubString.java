package String.BasicQues;

public class PrintSubString {

    public static void Print_Substring(String str) {
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j-len;
                System.out.print(str.substring(i, j)+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "hello";
        // String str = "CodingBlocks";
        
        Print_Substring(str);
    }
}
