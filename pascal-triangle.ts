// Time complexity - O(n^2), n = number of rows
// Space complexity - O(1)
function generate(numRows: number): number[][] {
	let triangle: number[][] = new Array(numRows);
	triangle[0] = [1];

	for (let i = 1; i < numRows; i++) {
		triangle[i] = new Array(i + 1);
		triangle[i][0] = 1;
		for (let j = 1; j < i; j++) {
			// next = [r-1 + c][r-1,c-1]
			const next = triangle[i - 1][j - 1] + triangle[i - 1][j];
			triangle[i][j] = next;
		}
		triangle[i][i] = 1;
	}

	return triangle;
}
