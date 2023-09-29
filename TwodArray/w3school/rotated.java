package w3school;
public class rotated {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if the array is sorted in the left half or the right half
            if (nums[mid] > nums[right]) {
                // The minimum element is in the right half
                left = mid + 1;
            } else {
                // The minimum element is in the left half or at the current mid
                right = mid;
            }
        }

        // When the loop terminates, 'left' will point to the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int minElement = findMin(rotatedArray);
        System.out.println("The minimum element in the rotated sorted array is: " + minElement);
    }
}
