package Set4_Recursion_BinarySearch.Div1;
public class SumN {
    static int sum(int n) {
        if(n == 0) return 0;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5)); // 1+2+3+4+5 = 15
    }
}