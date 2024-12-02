import java.util.*;
// TC = O(N)
// SC = O(N)
class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> number_count = new HashMap<>();
        HashSet<List> pairs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(number_count.containsKey(nums[i])){
                number_count.put(nums[i],number_count.get(nums[i])+1);
            }
            else{
                number_count.put(nums[i],1);
            }
        }
        if(k==0){
            for(int i=0;i<nums.length;i++){
                int diff = nums[i]-k;
                if(number_count.containsKey(diff) && number_count.get(diff)>1){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(diff);
                    Collections.sort(pair);
                    pairs.add(pair);
                    number_count.put(diff,number_count.get(nums[i])-1);
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                int diff = nums[i] - k;
                if(number_count.containsKey(diff) && number_count.get(diff)!=0){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(diff);
                    Collections.sort(pair);
                    pairs.add(pair);
                    number_count.put(diff,number_count.get(nums[i])-1);
                }
            }

        }
        System.out.println(pairs);
        return pairs.size();

    }

    public static void main(String[] args) {
        System.out.println(KDiffPairs.findPairs(new int[]{1,2,4,4,3,3,0,9,2,3},3));
    }
}