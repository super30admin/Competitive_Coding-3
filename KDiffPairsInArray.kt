//In this problem, we were to return unique number of pairs in an array such that their difference is equal to k. In the solution, I have used a hashmap to store the frequency of each number in the array. 
// Then, I iterate through the keys of the hashmap to check for each key if there exists another key such that their difference is k.
// If k is zero, I check if the frequency of the key is greater than one to count it as a valid pair.
//Time complexity of this solution is O(n) where n is the number of elements in the array
//Space complexity is also O(n) due to the hashmap storing the frequencies of the elementss

class Solution {
    fun findPairs(nums: IntArray, k: Int): Int {
        
        var count = 0
        val map = HashMap<Int, Int>()

        for (n in nums) {
           map.put(n, map.getOrDefault(n, 0 ) + 1) 
        }

        for(key in map.keys) {
            if(k == 0){
                if (map.getOrDefault(key, 0) > 1) {
                    count++
                }
            } else if(map.containsKey(key - k)) {
                count++
            }         
        }
        return count
    }
}