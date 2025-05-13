package String.CodeSkiller;
import java.util.Scanner;
public class FindCB {
    public static boolean CheckCB(long n) {
		if(n == 0 || n == 1) {
            return false;
        }
		int arr[] = {2,3,5,7,11,13,17,19,23,29};
		for(int i = 0; i < arr.length;i++) {
			if(n == arr[i]) {
				return true;
			}
		}
		for(int i = 0; i < arr.length;i++) {
			if(n % arr[i] == 0) {
				return false;
			}
		}
		return true; 
	}
	public static boolean isvisited(boolean[] visited,int i,int j) {
		for(int k = i ; k < j;k++) {
			if(visited[k] == true) {
				return false;
			}
		}
		return true;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int count = 0;
		boolean[] visited = new boolean[n];
		for(int len=1;len <= n; len++) {
			for(int j = len;j <= n; j++) {
				int i = j-len;
				long num = Long.parseLong(str.substring(i,j));
				if(CheckCB(num) && isvisited(visited, i, j)) {
					count++;
					for(int k = i;k < j;k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
    }
}
