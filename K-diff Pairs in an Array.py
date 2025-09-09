'''
Competiving Coding 3: K-diff pairs in an array
abs|nums[i] - nums[j]| = k
=> nums[i] - nums[j] = +/- k   
=> nums[i] = k + nums[j] or nums[i] = -k + nums[j]
We search for nums[i], for curr_element = nums[j]
We maintain a Visited set where we store the elements as we iterate through the
array. For each current element, we search for k+nums[i] and -k+nums[i] in the visited
set, if found, we store the pair in sorted fashion in a set called unique_sets. This way
we can handle the duplicate pairs. At the end, return the length of this unique_sets.
Time Complexity: O(N) - iterating over the array.
Space Complexity: O(N) - maintaing visited and unique sets which can store at Most N elemnts  
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        visited = set()
        unique_sets = set() 
        for i in range(len(nums)):
            if k+nums[i] in visited:
                pair = tuple(sorted((k+nums[i], nums[i])))
                unique_sets.add(pair)
            if -k+nums[i] in visited:
                pair = tuple(sorted((-k+nums[i], nums[i])))
                unique_sets.add(pair)
            visited.add(nums[i])

        return len(unique_sets)