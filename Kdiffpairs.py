class Solution(object):
	# tc : O(n)
	# sc : O(1)
    def findPairs(self, arr, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # Brute force : check every pair and once found the pair sort the values in the pair and add them in a set ( this will take care of duplicates)
        # and return the number of pairs in the hash set tc : O(n2) , sc : O(n)

        # optimal approach using two pointers but first sort it, now it is similar to 2sum ( just have to find diff)
        # ith pointer from 0, j to 1 and iterate till j pointer reaches till the end of the arr
        # if nums[j] - nums[i] <k then we have increase the nums[j] by moving j to right
        # if nums[j] - nums[i] > k then move the ith pointer to the right
        # if found the pair move both , one edge case to handle if i and j are equal we should move j to next so that we dont subtract with the same index ( i != j)
        # To skip duplicates move i and j till we find a diff number than its current value. 
        # Return the cnt of pairs found 


        arr.sort()
    	
        cnt = 0 # intial count 0 
    	
        if len(arr) < 2: # edge case 
    	    return 0 
    	    
    	i = 0  
		j = 1 
    	n = len(arr)
    
    	
    	while (j < n): 
    	    if i == j: 
    	        j+= 1
    	        continue
    	        
    	    if arr[j] - arr[i] < k: 
    	        j +=1
    	    elif arr[j] - arr[i] > k:
    	        i +=1
    	   
    	    else:
    	        while(i+1<n and arr[i+1] == arr[i]): 
    	            i +=1 # moving i untill we found a unique value
    	        while(j+1<n and arr[j+1] == arr[j]):
    	           j +=1
    	           
    	        cnt += 1
    	        i +=1
    	        j +=1
    	   
    	       
    	return cnt
	


    	       