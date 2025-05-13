package SlidingWindow;

public class frequecyCount {
    public static void main(String[] args) {
        String str = "ufajdfharfuahfoahfdfhafpwiemmbsbxieoekafafflhaofhpoazzzhyyf";
        int[] freq_count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            freq_count[index]++; // freq_count[index] = freq_count[index] + 1;
        }
        for (int j = 0; j < freq_count.length; j++) {
            System.out.print(freq_count[j] + " ");
            if (freq_count[j] == 0) {
                System.out.println((char) (j + 97)); // missing character in a given string
            }
        }
    }
}
