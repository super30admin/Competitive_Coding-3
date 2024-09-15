# Complete the maxSubarray function below.
def maxSubarray(arr):

    if( arr ==[] or len(arr)==0):
        return 0,0
    maxsubseq=0
    maxsubarr=arr[0]
    
    if(len(arr)==1):
        return arr[0],arr[0]
    count=0
    
    for i in arr:
        if (i>=0):
            maxsubseq=maxsubseq+i
        else:
            count+=1
            
    if(count==len(arr)):
        return max(arr),max(arr)
    
    for i in range(1,len(arr)):
        arr[i]=max(arr[i-1]+arr[i],arr[i])
        maxsubarr=max(maxsubarr,arr[i])
        
    return maxsubarr,maxsubseq