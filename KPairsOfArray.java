import java.util.*;

public class KPairsOfArray {
	
	//TC - o(nlogn) (sorting + n traverse)
    //SC - o(1)
    /*public int findPairs(int[] nums, int k) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int left =0, right = 1;
        int count =0;
        
        while(left < nums.length && right <nums.length ) {
            
            int diff = nums[right] - nums[left];
            
            //if diff is grater means we have found all the possibilities for the left index
            //increase left by one
            if(diff > k) {
                left++;
            } 
            //if left and right are at the same index of diff is less thn k increase right 
            else if(left == right || diff < k) {
                right++;
            }
            //else we found a pair incerease both pointers and count
            else{
                left++;
                right++;
                count++;
                //check for duplicates 
                //if same incr right
                while( right<nums.length && nums[right] == nums[right-1])
                    right++;
            }
        }
        return count;
    }*/
	
	//TC - o(n)
    //SC - o(1)
    public int findPairs(int[] nums, int k) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int count =0;
        //no need to sort , search in o(1)
        //also unique keys no need to handle duplicates val
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //store freq to map
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        //traverse the map
        for(Map.Entry<Integer,Integer> eSet: map.entrySet()) {
            int key = eSet.getKey();
            int val = eSet.getValue();
            
            //if k is grater thn zero check map contains value x+k
            //if yes increase count
            if(k>0 && map.containsKey(key+k)) {
                count++;
            }
            //edge case . if k is zero check freq val is grater thn 1 or not
            else if(k ==0 && val > 1) {
                count++;
            }

        }
        return count;
    }

}
