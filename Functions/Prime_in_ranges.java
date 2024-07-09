package Functions;

public class Prime_in_ranges {
    public static boolean isPrime(int n){
        // boolean isprime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void prime_in_ranges(int start,int end){
        for(int i=start;i<=end;i++){
            // isPrime(i);
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(45));
        prime_in_ranges(11, 50);
    }
}
