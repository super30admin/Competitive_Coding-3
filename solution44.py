#Time Complexity:O(n)
#Space Complexity:O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count=0                     #Defining a count variable
        h=defaultdict(int)          #Declaring a hash map
        for elem in nums:           # initializing the hashmap with every element in the array as key and its count as value
            h[elem]+=1
        for j in h:                 # for every element in the hash map
            if k==0:                # if diff is zero and value in hashmap greater than one 
                if h[j]>1:          
                    count+=1        #then increment count by one
            elif(j+k in h):         #else if for every j there exists j+k elemengt in hashmap
                count+=1            # increase count by one
        return count                # returning the count of possible pairs.