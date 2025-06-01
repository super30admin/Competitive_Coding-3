
// Did this code successfully run on Leetcode : YES 
// Any problem you faced while coding this : NONE

var generate = function(numRows) {
    // Time Complexity : O(N X M)
// Space Complexity :O(1) // because we are using the nested to return or else its O(N X M) 
    let res=[]
    for(let i =0;i<numRows;i++){
        let row = []
        for(let j=0;j<=i;j++){
            if(j==0 || j==i){
                row.push(1)
            }
            else{
                //Matching the pattern up + up left
                row.push((res[i-1][j])+(res[i-1][j-1]))
            }
        }res.push(row)
    }
    return res
}


// var generate = function(numRows) {
//     let res = []
//     for(let i = 0;i<numRows;i++){
//         let rows = []//my rows
//         for(let j=0;j<=i;j++){  
//         // rows[j] 
//         if(j==0 && j==i){
//         //first and last ele
//         rows.push(1)
//         }
//         else{
//         //middle ele
//         rows.push((res[i-1][j])+(res[i-1][j-1]))
//         // rows.push((TOP)+(TOPLEFT))
//         }
      
//            return res
//     }
//     //Return nested arrays matrix
//     }