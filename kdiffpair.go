// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
set count = 0
create map of elements and their counts
if length <2 return count
loop through elements and set m[element]++
2 cases if k==0 and element count 1 increment count
after loop if k == 0 return count else
loop through elements again if element + k value element exists and elements count !=-1 increment count and set count = -1
*/
package main

import "fmt"

func findPairs(nums []int, k int) int {
	if len(nums) < 2 {
		return 0
	}
	c := 0
	m := make(map[int]int)

	for i:=0;i<len(nums);i++ {
		v, e := m[nums[i]]
		m[nums[i]] = v + 1
		if e && v == 1 && k == 0 {
			c++
		}
	}
	if k == 0 {
		return c
	}
	for i:=0;i<len(nums);i++ {
		vorg := m[nums[i]]
		_, e := m[nums[i] + k]
		if e {
			if vorg != -1 {
				c++
				m[nums[i]] = -1
			}
		}
	}
	return c
}

func MainKDiffPair() {
	fmt.Println(findPairs([]int {1,2,4,4,3,3,0,9,2,3}, 3)) //expected 2
}
