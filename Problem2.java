//Accepted on LT
//The idea is to see for compliment in hashmap and if we fail to find than add the element .
//Time should be O(n)

class Solution {
    public int findPairs(int[] nums, int k) {

        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int counter = 0;
        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i])){
                int compliment = k - nums[i];
                if(compliment< 0){
                    if(hs.contains(compliment) ||hs.contains(-compliment)) {
                    counter++;

                    }

                }
                else{
                    if(hs.contains(compliment) ) {
                    counter++;

                    }

                }
                

                hs.add(nums[i]);
            }
            else{
                int compliment = k - nums[i];
                if(hs.contains(compliment) ||hs.contains(-compliment)){
                    counter++;
                }
            }
            
            


        }
        return counter;
        
    }
}