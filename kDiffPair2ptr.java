import java.util.Arrays;
public class kDiffPair2ptr {

        public int findPairs(int[] nums, int k) {

            Arrays.sort(nums);
            int n = nums.length;

            // two pointers
            int l = 0, r = 1;

            int count = 0;

            //pointers not exceed array length
            while(l < n && r < n){

                // if pointers diff is less, move right pointer
                if(l == r || nums[r] - nums[l] < k){
                    r++;
                }

                // if pointers diff is more, move left pointer
                else if(nums[r] - nums[l] > k){
                    l++;
                }

                else{
                    count++;

                    l++;

                    while(l < n && nums[l] == nums[l -1]){
                        l++;
                    }
                }
            }
            return count;
        }

        /*
        Time Complexity = O(nlogn) for sorting
        Space Complexity = O(n) depends on sorting algorithm
        */

        public static void main (String[] args){

            kDiffPair2ptr object = new kDiffPair2ptr();

            int[] arr = {5,1,9,3,5,7};

            int kDiff = 4;

            int result = object.findPairs(arr, kDiff);

            System.out.println("Number of unique pairs in the array with k-difference is " + result);

        }
}
