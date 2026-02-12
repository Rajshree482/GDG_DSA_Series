package Set3_Math_Arrays.Div2;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        int i = 0;
        for(int j=1; j<arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Unique count: " + (i+1));
    }
}