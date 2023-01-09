/*
    approach: complement search
    - this is like two sum in a lot of ways (i.e complement search, sorting + two ptrs, sorting + binary search)
    - the differences is we would have to count all pairs vs just finding 1 pair
    - and the input array may contain duplicates, and so we have to count dupes as 1 pair only
        - for example (1,2) and (2,1) is the same pair ( values matter, their idx and how they are used as pairs do not matter )
    - The other difference is that we have find a pair, whose abs(diff) == k
    - if k = 2 and input array is [3,1,4,1,5]
        - i = 0; what number do we need to subtract from 3 (idx 0) to make it equal to 2
            - 3-x = 2; -x = 2-3; x = 1
            - so we need a 1. ( 3-1 does equal to 2 )
            - there is another way
            - 5-3 is also 2, i.e x = 2+3 ( 5-3 does equal to 2 )
            - so we have two complements to search for
        - SEARCH! so lets put nums in a idx map for now so we can search easily
    - To eliminate duplicate pairs
        - we will do what we did in 3sum
        - set of sorted pairs ( where each pair is sorted )
        - if we find a pair, we will sort this pair and check if we have seen/used this pair before ( check in our set of pairs )
        - increment our counter, if we have not seen this pair and then add it this sorted pair to our set of sorted pairs.
    - What if k is 0
        - nums =    [3,1,4,1,5]
        - idxMap =  {3:0,1:3,4:2,5:4}
        - and i = 0
        our two complements to search for will be;
        - 3+0 = 3
        - 3-0 = 3
        ... so 3 does exist, but we cannot use the same idx right!
        lucky for us, we have an idx map that tells us where 3's position is which is idx 0
        - so only consider a complement if found and its idx != current i
            - this way we wont add (3,3)...
        when i goes to idx 1 ( value 1 )
        our two complements to search for will be;
        - 1+0 = 1
        - 1-0 = 1
        - we have both complements, so therefore we will spearate them into 2 chunks of checks
        1. complement1 ; 1+0 = 1
        - 1 does exist and its idx in idxMap is 3 which != current i (2)
        - then check whether we have seen this pair in our sorted set. no we have not
        - use it, increment our counter and move on
        1. complement2 ; 1-0 = 1
        - 1 does exist and its idx in idxMap is 3 which != current i (2)
        - then check whether we have seen this pair in our sorted set. yes we have ( we just added this pair )
        - so skip
        
        when i goes to idx 3 ( value 1 )
        our two complements to search for will be;
        - 1+0 = 1
        - 1-0 = 1
        - we have both complements, so therefore we will spearate them into 2 chunks of checks
        1. complement 1 ; 1+0 = 1
        - 1 does exist and its idx in idxMap is 3 which == current i (3)
        - cant use 2 numbers from the same idx! skip and move on

    time: o(n) + o(n2log2) = o(n)
    time: o(n) + o(n) = o(n) ( was able to remove sorting 2log2 because we are just sorting a pair of 2 nums )
    space: o(n)
*/
func findPairs(nums []int, k int) int {
    idxMap := map[int]int{}
    for i := 0; i < len(nums); i++ {
        idxMap[nums[i]] = i
    }
    set := newSetOfPairs()
    count := 0
    
    for i := 0; i < len(nums); i++ {

        comp1 := nums[i]+k
        idx, comp1Found := idxMap[comp1]
        if comp1Found && i != idx {
            tmp := [2]int{comp1, nums[i]}
            if !set.containsPair(tmp) {
                count++
                set.addPair(tmp)
            }
        }
        
        comp2 := nums[i]-k
        idx2, comp2Found := idxMap[comp2]
        if comp2Found && i != idx2 {
            tmp := [2]int{comp2, nums[i]}
            if !set.containsPair(tmp) {
                count++
                set.addPair(tmp)
            }
        }
        
    }
    
    return count
}

type setOfPairs struct{
    items map[[2]int]struct{}
}
func newSetOfPairs() *setOfPairs{
    return &setOfPairs{items: map[[2]int]struct{}{}}
}
func (s *setOfPairs) addPair(n [2]int) {
    // sort it first
    if n[1] < n[0] {
        n[0], n[1] = n[1],n[0]
    }
    s.items[n] = struct{}{}
}
func (s *setOfPairs) containsPair(n [2]int)  bool {
    // sort it first
    if n[1] < n[0] {
        n[0], n[1] = n[1],n[0]
    }
    _, ok := s.items[n]
    return ok
}
