package Set3_Math_Arrays.Div1;
public class ReverseDigit {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while(n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println("Reversed: " + rev);
    }
}