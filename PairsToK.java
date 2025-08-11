// This solution utilizes the running set where we place the numbers encountered into a hashset. Everytime a number is passed, we just check both the possible pair scenarios in the set. If it checks out we just add the pair into a set which prevents duplicates
class Solution {
    public int findPairs(int[] nums, int k) {
        Set<List<Integer>> set = new HashSet();
        Set<Integer> map = new HashSet();
        for(int i=0;i<nums.length;i++) {
            int a = k+nums[i];
            int b = nums[i]-k;

            if(map.contains(a)) {
                List<Integer> list = new ArrayList();
                if(a>nums[i]){list.add(nums[i]); list.add(a);}
                else {list.add(a); list.add(nums[i]);}
                set.add(list);
            }
            if(map.contains(b)) {
                List<Integer> list = new ArrayList();
                if(b>nums[i]){list.add(nums[i]); list.add(b);}
                else {list.add(b); list.add(nums[i]);}
                set.add(list);
            }
            map.add(nums[i]);
        }
        return set.size();
    }
}
