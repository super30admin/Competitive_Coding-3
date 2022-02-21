// space complexity - o(1)
    //time - o(nlogn + n)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : Sort the array and use two sum logic, move both starta nd end pointer from begining of array
      // compare teh differnece of start and end with target and anbsd on the move pointers
      // to remove duplicates , move end till end-1 and end are not same

public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);

        int count  = 0;
        int start = 0;
        int end = 1;

        while(end < nums.length){
            if(start == end){
               end++;
            }
            else{
                if(nums[end] -  nums[start] == k){
                    count++;
                    start++;
                    end++;
                }
                else if(nums[end]  - nums[start] < k){
                    end++;
                }
                else{
                    start++;
                }

                while(end < nums.length && nums[end] == nums[end-1]  ){
                    end++;
                }
            }
        }
        return count;
    }
