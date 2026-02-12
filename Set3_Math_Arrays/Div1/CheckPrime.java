package Set3_Math_Arrays.Div1;
public class CheckPrime {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = true;
        for(int i=2; i*i <= n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Is Prime: " + isPrime);
    }
}