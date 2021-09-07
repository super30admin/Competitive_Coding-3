//Using two HashSets, there are also two cases: k equals 0 and K does not equal 0. If k equals 0, traverse the array, if the 
//current element does not exist in set1, add it to set1, if there is set1, then judge whether it exists in set2, if not, add 1 
//times, and add the element to set2.If k is not equal to 0, traverse the array, add the current element to set1, add the 
//current element to k and then add to set2, then use the retainAll method, remove the elements that do not contain set2 elements 
//in Set1 (that is, the intersection of two sets), and finally count equals the number of elements in set1.
class Solution {
    public int findPairs(int[] nums, int k) {
         if (nums == null || nums.length == 0 || k < 0) {
        return 0;
    }
    Set<Integer> set1 = new HashSet<Integer>();
    Set<Integer> set2 = new HashSet<Integer>();
    int count = 0;
    if (k == 0) {
        for (int n : nums) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                if (!set2.contains(n)){
                    count++;
                }
                set2.add(n);
            }
        }
    } else {
        for (int n : nums) {
            set1.add(n);
            set2.add(n + k);
        }
        set1.retainAll(set2);
        count = set1.size();
    }
    return count;
   }
}