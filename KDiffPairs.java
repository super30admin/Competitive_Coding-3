class Solution {
public int findPairs(int[] nums,int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<ArrayList> set = new HashSet<>();
        for(int i=0;i < nums.length ; i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        if(k==0){
            for (int freq : map.keySet())
        {
            // search  for value
            int frequency = map.get(freq);
            if(frequency>1){
                ArrayList<Integer> list1 = new ArrayList<Integer>(
            Arrays.asList(freq));
                 set.add(list1);
            }
        }
        }
        else{
             for(int i=0;i < nums.length ; i++){
            if(map.containsKey(nums[i]-k)){
                ArrayList<Integer> list1 = new ArrayList<Integer>(
            Arrays.asList(nums[i]-k,nums[i]));
                 set.add(list1);
            }
            else if(map.containsKey(nums[i]+k)){
                   ArrayList<Integer> list1 = new ArrayList<Integer> (Arrays.asList(nums[i],nums[i]+k));
                 set.add(list1);
            }
        }
        }
        return set.size();
    }
}

//Time Complexity= O(n)
//Space Complexity = O(n)