'''
Solution
1.  Use a HashMap (to store indices) and a HashSet (to store the pairs) to calculate the count of k-diff pairs
2.  Check whether the current element's complement exists in HashMap or not and if yes add the pair to the HashSet
3.  Return the count of HashSet
'''

class KDiffPairs(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if (k < 0):
            return 0

        #   A separate HashSet for k = 0 case
        zero_pairs = set()

        #   HashMap and HashSet initialization
        locations = {}
        pairs = set()

        # Update HashMap
        for i in range(len(nums)):
            if (nums[i]) in locations:
                if (k == 0):
                    zero_pairs.add(nums[i])
            else:
                locations[nums[i]] = i

        #   check for one of two complements and add the pair if complement exists
        for i in range(len(nums)):
            comp1 = nums[i] - k
            comp2 = nums[i] + k
            if (comp1 in locations) and (comp1, nums[i]) not in pairs:
                pairs.add((comp1, nums[i]))
            if (comp2 in locations) and (nums[i], comp2) not in pairs:
                pairs.add((nums[i], comp2))

        #   return for k = 0 case and the rest case
        if (k == 0):
            return len(zero_pairs)
        return len(pairs)
