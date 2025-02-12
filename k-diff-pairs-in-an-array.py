# Approach:
# We use a Counter to store the frequency of elements in nums. Then, we iterate through the unique elements, 
# checking if i + k exists for k > 0 or if i appears more than once for k == 0.

# Time & Space Complexity:
# Time Complexity: O(n) (Single pass to count elements, another to check pairs).
# Space Complexity: O(n) (Storing element frequencies in Counter).
def findPairs(self, nums: List[int], k: int) -> int:
        counter = Counter(nums)
        count = 0
        for i in counter:
            if k == 0:
                if counter[i] > 1:
                    count += 1
            else: 
                if i + k in counter:
                    count += 1
        return count