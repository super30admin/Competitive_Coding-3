import java.util.HashMap;

// Time: O(n)
//Space: O(n)
public class findComplementPairs {
    //Question:  Given an array and a target, find the count of pairs that has the difference = target
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }

        for(int key:hmap.keySet()){
            if(k != 0){
                if(hmap.containsKey(key+k)){
                    count += 1;
                }
            }else{
                if(hmap.get(key) > 1){
                    count += 1;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3,1,4,1,5},2));
    }


}
