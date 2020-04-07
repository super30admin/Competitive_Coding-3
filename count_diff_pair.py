Time complexity: O(n^2)
Space complexity: O(1)
Challenges: No Leetcode link
Executed in leetcode: No, executed in jupyter notebook

Comments: Given below
  
def countdiffPairs(arr, k): 
    count = 0
    length = len(arr)
      
    # Iterate over the elements one by one 
    for i in range(0, length): 
          
        # Iterate over the elements from i+1 to length to find the pair 
        for j in range(i+1, length) : 
              
            # Check if difference between them (a-b and b-a) is equal to k for 
            if (arr[i] - arr[j] == k) | (arr[j] - arr[i] == k): 
            # Same as  - if arr[i] - arr[j] == k or arr[j] - arr[i] == k: 
                count += 1
                
    #Return the result             
    return count 
  
# Check results
arr = [1, 5, 3, 4, 2] 
print ("Count is: ", countdiffPairs(arr, 4)) 
