// Time Complexity : O(N) (Hashmap apporach) O(N log N) - sort and two pointer
// Space Complexity : O(N) hashmap O(1) - sort and two pointer
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {

        /**
         * Using Hashmap approach - maintaining index and its frequency in the map
         * T -O(N)
         * S-O(N)
         */
        public int findPairs(int[] nums, int k) {
            int output = 0;

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i =0;i< nums.length;i++) {
                map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
            }

            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                int key = entry.getKey();
                int val = entry.getValue();

                if(k > 0 && map.containsKey(key+k)){
                    output++;
                }else if(k ==0 && val > 1) {
                    output++;
                }
            }
            return output;
        }

        /**
         * below approach is using sorting the array and using two pinters to traverse the array
         * left starts at 0 and right starts at 1
         * by comparing the difference of left and right with k and incrementing the pointers left or right
         * if the difference is equal to k then count the pair and return the counter
         * T = O(n log n)
         * S =O(1)
         */
        Arrays.sort(nums);

        int left =0;
        int right=1;
        int output =0;

        while(left < nums.length && right < nums.length){

            if(left == right || nums[right] - nums[left] < k)  {
                right++;
            }else if(nums[right] - nums[left] > k) {
                left++;
            }else{
                left++;
                output++;

                while(left < nums.length && nums[left] == nums[left-1]) {
                    left++;
                }
            }
        }
        return output;
    }
}