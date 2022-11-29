// Time Complexity : O(n)
// Space Complexity :O(n) 
class Solution {
    public int findPairs(int[] nums, int k) {
        int cnt=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<List<Integer>> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            int a=nums[i]+k;
            int b=nums[i]-k;
            if(hm.containsKey(a)){
                List<Integer> temp=new ArrayList<>();
                temp.add(a);
                temp.add(nums[i]);
                Collections.sort(temp);
                if(!hs.contains(temp) && hm.get(a)!=i){
                    hs.add(temp);
                }
            }
            if(hm.containsKey(b)){
                List<Integer> temp=new ArrayList<>();
                temp.add(b);
                temp.add(nums[i]);
                Collections.sort(temp);
                if(!hs.contains(temp) && hm.get(b)!=i){
                    hs.add(temp);
                }
            }
        }
        return hs.size();
    }
}