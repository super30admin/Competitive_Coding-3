/*
# O(n) time and space
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        mapping_freq = dict()
        for i in nums:
            if i in mapping_freq:
                mapping_freq[i] += 1
            else:
                mapping_freq[i] = 1
                
        adding = 0
        count = 0
        
        for key in mapping_freq:
            adding = key + k
            mapping_freq[key] -= 1
            if adding in mapping_freq and mapping_freq[adding] > 0:
                count += 1
            mapping_freq[key] += 1
            
        return count

# O(nlogn) time and O(1) space
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        slow, fast = 0, 0
        n = len(nums)
        count = 0
        nums.sort()
        while slow < n and fast < n:
            if slow == fast or nums[fast] - nums[slow] < k:
                fast += 1
                
            elif nums[fast] - nums[slow] > k:
                slow += 1
                
            else:
                count += 1
                slow += 1
                fast += 1
                while fast < n and nums[fast] == nums[fast-1]:
                    fast += 1
        return count
                
*/
// time - O(nlogn) where n is array length
// space - O(1)
// Logic - sorted the array and calculated difference each time. Proceeded with slow and fast pointer accordingly
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int slow = 0, fast = 0;
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);
        while (slow < n && fast < n){
            if (slow == fast || nums[fast] - nums[slow] < k) 
                fast ++;
            else if (nums[fast] - nums[slow] > k )
                slow ++;
            
            else{
                count ++;
                slow ++; fast++;
                while (fast < n && nums[fast] == nums[fast-1])
                    fast++;
            }
        }
        return count;
    }
}