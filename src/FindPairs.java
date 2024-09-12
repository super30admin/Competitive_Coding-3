import java.util.HashMap;

//TC O(n)
//SC O(n)
public class FindPairs {
    public int findPairs(int[] nums, int k) {
        if(nums.length==0||nums==null)
            return -1;

        int count = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }

        for(int key : map.keySet()){
            if(map.containsKey(key+k)&&k>0){
                count++;
            }else if(map.get(key)>1&&k==0)
                count++;
        }
        return count;
    }
}
