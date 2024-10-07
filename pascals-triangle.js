/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let res = [];
    //if given numRows is 1, just return 1
    if(numRows === 1) {
        res.push([1]);
        return res;
    }

    //if not iterate through the numRows-1, starting from 0
    else {
        for(let i = 0; i <= numRows-1; i++) {
            let smallerRes = [];
            //for 1st row with index 0, push 1 to final result, assuming all edges are 1s
            if(i === 0) {
                res.push([1]);
            }

            //for second row with index 1, it will only have edge elements so push [1,1] to smaller result and push that to final
            else if(i === 1) {
                smallerRes.push(1,1);
                res.push(smallerRes);
                
            }
            
            // for rest of the rows, for the first element push 1 as it will be an edge element, we will do the same for final element later
            else if(i > 1) {
                smallerRes.push(1);
                //iterate through the number of elements in each row, as though they are columns, for each row there will be same number of columns, since index 0, adjust that
                for(j = 1; j < i; j++){
                    //to find the sum of the element of 2 previous top elements, find previous row and the same column and previous row previous column
                    let sum = res[i-1][j-1] + res[i-1][j] 
                    smallerRes.push(sum);
                    if(j === i - 1) {
                        smallerRes.push(1);
                    }
                   
                }
                 res.push(smallerRes);
            }
        }
    }
    
    return res;
};