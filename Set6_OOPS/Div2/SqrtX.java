package Set6_OOPS.Div2;
public class SqrtX {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        
        long start = 1;
        long end = x;
        long answer = 0;
        
        while (start <= end) {
            long mid = start + (end - start) / 2;
            
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                answer = mid; 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) answer;
    }

    public static void main(String[] args) {
        System.out.println("Square root of 8 is approximately: " + mySqrt(8)); // Output: 2
    }
}