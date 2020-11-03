"""
Time Complexity : O(n)
Space Complexity : O(n) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
Following is my code which I submitted for my mock interview. Here, i made a dictionary wheere i am keeping a 
count of all the numbers inside the array. After that, I start iterating through the dictionary. At
every point, I check that (val+target) is in dictioanry or not. If it is there in dictionary,that means
that we have found a pair. So we just increment the count, and set the value of (val+target) to 0. This 
is done because next time if we again have the same value, we will find (val+target) again which will
lead to duplicacy. So whenever we check for presence of (val+target) inside dictionary, we also check
if its value zero or not. Also, there is one edge case as well which we have taken care of. In case, 
target is 0, then according to my logic, every time i check (val+target), it would be value only,
which is in dict. So we just check if target is zero and if  its value>1.
"""


class Solution(object):
    def findPairs(self, nums, k):
        if not nums or len(nums) == 0:
            return 0
        d = {}
        count = 0
        for i in nums:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        for i in d:
            if k == 0:
                if d[i] > 1:
                    count += 1
            else:
                if (i+k in d) and d[i+k] != 0:
                    d[i+k] = 0
                    count += 1
        return count
