# Complete the hackerlandRadioTransmitters function below.
def hackerlandRadioTransmitters(x, k):
    if (x==[] or len(x)==0):
        return 0
    x=sorted(x)
    count=0
    i=0
    while(i<len(x)):
        range1=x[i]+k
        count+=1
        while(i<len(x) and range1>=x[i]):
            i+=1
        range1=x[i-1]+k
        while(i<len(x) and range1>=x[i]):
            i+=1
        
    return count