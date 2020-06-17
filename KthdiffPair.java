/*
    Approach 1 : two HashMap 


    Time complexity : O(N)
    Space Complixity : O(N)
    Worked on leetcode YES

    Approach  2:  two Pointer 

    
    Time complexity : O(N)
    Space Complixity : O(1)
    Worked on leetcode YES

*/

public class KthdiffPair{

    public int findPairs_2HashMap(int[] nums, int k) {
        //         if (nums == null || nums.length == 0) return 0;
        //         HashSet<Integer> set= new HashSet<Integer>();
        //         HashSet<Integer> result= new HashSet<Integer>();
        //         for(int num : nums){
        //             if(set.contains(num+k)) result.add(num);
        //             if(set.contains(num-k)) result.add(num-k);
        //             set.add(num);
        //         }
        //         return set.size();
                if (k < 0) return 0;
                Set<Integer> numbers = new HashSet<>();
                Set<Integer> found = new HashSet<>();
                for (int n : nums) {
                    if (numbers.contains(n + k)) found.add(n);
                    if (numbers.contains(n - k)) found.add(n - k);
                    numbers.add(n);
                }
                return found.size();
                
    }


    public int findPairs_Two_Pointer(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int i=0;
        int j=1;
        int count=0;
        Arrays.sort(nums);
        for(;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            j = Math.max(j, i+1);
            while(j<nums.length){
                if( nums[j] - nums[i] == k){
                    count++;
                    break;
                } else if( nums[j] -nums[i] < k){
                    j++;
                }else{
                    break;
                }
            }  
        }
        return count;
        
    }
}

