package Set6_OOPS.Div2;
public class SqrtX {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        
        long start = 1;
        long end = x;
        long answer = 0;
        
        while (start <= end) {
            long mid = start + (end - start) / 2;
            
            // If mid*mid exactly matches x
            if (mid * mid == x) {
                return (int) mid;
            }
            
            // If mid*mid is smaller, our answer might be mid, but let's check higher numbers
            if (mid * mid < x) {
                answer = mid; // Store potential answer
                start = mid + 1;
            } else {
                // If mid*mid is too large, look at smaller numbers
                end = mid - 1;
            }
        }
        return (int) answer;
    }

    public static void main(String[] args) {
        System.out.println("Square root of 8 is approximately: " + mySqrt(8)); // Output: 2
    }
}