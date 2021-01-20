#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result=[]                               #Creating an output array
        prev=[]                                 #Creating a meory array to remember previous row
        for i in range(1,numRows+1):            #for every row required
            arr=[1 for j in range(i)]           #creating an array of size i iniytialized with 1
            if i>2:                             # if i>2
                for k in range(1,i-1):          # except first and last element assigning prev[i-1]+prev[i] to all k positions
                    arr[k]=prev[k-1]+prev[k]
            prev=arr                            #storing memory of previous array for further processing
            result.append(arr)                  #appending each row to the final output array
        return result