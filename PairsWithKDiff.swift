//
//  PairsWithKDiff.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 4/5/26.
//

class PairsWithKDiff {
    
    init() {
        
    }
    
    func findPairs(_ nums: [Int], _ k: Int) -> Int {
        if (k < 0) {
            return 0
        }

        var seen = Set<Int>()
        //store the smaller element in result to avoid duplicates
        var result = Set<Int>()
        for num in nums {
             if (seen.contains(num - k)) {
                result.insert(num-k)
             }
             if (seen.contains(num + k)) {
                result.insert(num)
             }
             seen.insert(num)
        }
        return result.count
    }
    
    func findPairsUsingMap(_ nums: [Int], _ k: Int) -> Int {
        var map = [Int: Int]()

        for num in nums {
            map[num, default: 0] += 1
        }
        var count = 0
        for (num, frequency) in map {
            if (k == 0) {
                if (map[num]! > 1) {
                    count += 1
                }
            } else if (map[num + k] != nil) {
                count += 1
            }
        }
        return count
    }

}
