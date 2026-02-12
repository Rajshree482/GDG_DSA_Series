package Set4_Recursion_BinarySearch.Div2;
public class NumOccurrences {
    static int search(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                ans = mid;
                if(findFirst) end = mid - 1; // keep looking left
                else start = mid + 1; // keep looking right
            } else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3};
        int target = 2;
        int first = search(arr, target, true);
        int last = search(arr, target, false);
        if(first == -1) System.out.println(0);
        else System.out.println(last - first + 1);
    }
}