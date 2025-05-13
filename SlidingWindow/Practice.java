package SlidingWindow;

public class Practice {

    public static int window(String s, int k, char ch) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        int flip = 0;
        while (ei < s.length()) {
            
            //grow window
            if(s.charAt(ei) == ch) {
                flip++;
            }

            //shrink window
            while(flip > k) {
                if(s.charAt(ei) == ch) {
                    flip--;
                }
                si++;
            }

            //update answer
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "abaabaaaaabbaaaaab";
        int k = 2;
        int flip_a = window(str, k, 'a');
        int flip_b = window(str, k, 'b');
        System.out.println(Math.max(flip_a, flip_b));
    }
}
