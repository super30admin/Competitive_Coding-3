class Solution:
    def minWindow(self, s: str, t: str) -> str:
        match=0
        h={}
        tp=len(s)
        o=""
        for v in t:
            if v not in h:
                h[v]=1
            else:
                h[v]+=1
        i=0
        j=0
        
        while i<=j and i<len(s):
            
            if match == len(h):
                tp = min(tp,j-i)
                if tp == j-i:
                    o=s[i:j]
                    
            if (i!=j and match == len(h)) or j==len(s):
                if s[i] in h:
                    if h[s[i]]==0:
                        match-=1
                    h[s[i]]+=1
                    
                i+=1
            else:
                if s[j] in h:
                    if h[s[j]]==1:
                        match+=1
                    h[s[j]]-=1
                    
                j+=1
                
           
        return o
            
            
