#Pascal Triangle II: We just want the nth row of the pascal triangle
#time complexity O(n)
#space complexity O(1)
'''
Main idea: We know the pascal triangle is just the coefficients of the
binomial expansion to the nth power. From the binomial identity
nCk= (n-1)Ck+(n-1)C(k-1) [ (n choose k) equals (n-1 choose k )+ (n-1 choose k-1) ].
We see that this is exactly the mechanism of what the pascal triangle is doing since n
is the row and k represents the column.
So, the coefficient at at row n , column k , is just n choose k (n!/k!(n-k)!).
Now since there's only n+1 elements on the nth row, and that factorials are
implemented in O(1) time in python (they saved a lookup table). We get a very
efficient algorithm of O(n), instead of going through the whole triangle. Note that
if factorial wasn't implemented efficiently, this algorithm would be O(n^2)
since calculating one factorial is O(n) time, but even then, the space Complexity
is better than the dp solution
'''
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if rowIndex==0:
            return [1]
        res=[]
        for i in range(rowIndex+1):
            res.append(int(math.factorial(rowIndex)/(math.factorial(i)*math.factorial(rowIndex-i))))
        return res



#K-diff Pairs in an Array
#time complexity O(n)
#space complexity O(n)
'''
Brute force: Check all pairs, and return the unique ones by comparing traversing to the
res array each time
'''
'''
Main idea:We keep a count. traverse the array and add the elements to a hashset. for each element i in the
array when traversing, we check if i-k or i+k (both of them would give a unique pair of k-diff) is in the hashset.
These would form valid pairs. If i is already in the hashset, we do not add the pair to the result,
because it means that all the possible pairs until now were already added and if there's a new one
after, it will be added. This allows us to get the unique ones without the need of another sperate
hashset and sorting the pairs. Actually , to handle the case of k=0 , we will need to use a hasmap
instead and have the value indicate if we've added the pair or not (if the value>=1, means we've used the pair).
If k is not zero, we don't care about the values of the hashmap and proceed like above.
Of course if k is negative, we return 0.
'''

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #edge case
        if not nums or k<0:
            return 0
        h={}

        count=0
        for num in nums:
            # if k is 0
            if k==0 and num in h:
                if h[num]<1:
                    count+=1
                h[num]+=1
                continue
            elif k==0 and num not in h:
                h[num]=0
                continue

            #any other case
            if num in h:
                continue
            if num-k in h:
                count+=1
            if num+k in h:
                count+=1
            h[num]=0
        return count
