package Set1_Basics_Sorting.Div2;
import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // Input like "3+2+1"
        String[] numbers = s.split("\\+");
        Arrays.sort(numbers);
        
        System.out.println(String.join("+", numbers));
        sc.close();
    }
}
