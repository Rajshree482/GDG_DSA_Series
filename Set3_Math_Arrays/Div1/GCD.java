package Set3_Math_Arrays.Div1;
public class GCD {
    public static void main(String[] args) {
        int a = 48, b = 18;
        while(a > 0 && b > 0) {
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0) System.out.println(b);
        else System.out.println(a);
    }
}