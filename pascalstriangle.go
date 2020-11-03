// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
create 2d array of size n
loop though n times each time
create 1d array of size i+1
set 0th index of it to 1
loop from 1 to i
set jth index = sum of previous rows j-1th and j th index
set last index = 1
append 1d array to 2d
*/
package main

import "fmt"

func generate(numRows int) [][]int {
	if numRows <= 0 {
		return [][]int{}
	}
	res := [][]int{}
	for i:=0;i < numRows;i++ {
		resRow := make([]int, i + 1)
		resRow[0] = 1
		for j:= 1; j< i;j++ {
			resRow[j] = res[i-1][j-1]+res[i-1][j]
		}
		resRow[i] = 1
		res = append(res, resRow)
	}
	return res
}

func MainPascalsTriangle() {
	fmt.Println(generate(5))
	/*
	expected
	[
	[1],
	[1,1],
	[1,2,1],
	[1,3,3,1],
	[1,4,6,4,1]
	]*/
}
