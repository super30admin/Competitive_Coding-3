class KDiffPairs(object):
    def findPairs(self, nums, k):
        if (k < 0):
            return 0
        zero_pairs = set()

        locations = {}
        pairs = set()

        for i in range(len(nums)):
            if (nums[i]) in locations:
                if (k == 0):
                    zero_pairs.add(nums[i])
            else:
                locations[nums[i]] = i

        for i in range(len(nums)):
            comp1 = nums[i] - k
            comp2 = nums[i] + k
            if (comp1 in locations) and (comp1, nums[i]) not in pairs:
                pairs.add((comp1, nums[i]))
            if (comp2 in locations) and (nums[i], comp2) not in pairs:
                pairs.add((nums[i], comp2))

        if (k == 0):
            return len(zero_pairs)
        return len(pairs)