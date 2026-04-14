//
//  PascalsTriangle.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 4/5/26.
//

class PascalsTriangle {
    
    init() {
        
    }
    
    func generate(_ numRows: Int) -> [[Int]] {
        var output = [[Int]]()

        for i in 0..<numRows {
            if (i <= 1) {
                var o = [Int]()
                for _ in 0...i {
                    o.append(1)
                }
                output.append(o)
            } else {
                var o = Array(repeating: -1, count: i + 1)
                for k in 0...i  {
                    if (k == 0 || k == i) {
                        o[k] = 1
                    } else {
                        o[k] = output[i-1][k-1] + output[i-1][k]
                    }
                }
                output.append(o)
            }
        }
        return output
    }
}
