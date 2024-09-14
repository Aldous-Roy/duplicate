import java.util.Arrays;

public class duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // very important step in the solution.
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;        
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6};
        int [] arr2={2,4,6,2,0,9};
        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));
    }
}

