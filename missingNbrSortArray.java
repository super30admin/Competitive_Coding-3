class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;

        }
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low / 2);
            int midIdxDiff = nums[mid] - mid;
            int lowIdxDiff = nums[low] - low;
            int highIdxDiff = nums[high] - high;
            if (midIdxDiff != lowIdxDiff) {
                high = mid;
            } else if (midIdxDiff != highIdxDiff) {
                low = mid;
            }
        }
        return (nums[low] + nums[high]) / 2;
    }
        public static void main (String[]args){

            int nums[] = {1, 2, 3, 4, 5, 6, 8, 9};
            int size = arr.length;
            System.out.println("missing number: " + missingNumber(nums));

        }
    }