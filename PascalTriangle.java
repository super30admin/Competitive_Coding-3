import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {

        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> pascalTri = new ArrayList<>();

            //iterate over rows
            for(int i = 0; i < numRows; i++){ // O(n)

                List<Integer> pascalRow = new ArrayList<>();

                //iterate over elements in a row
                for(int j = 0; j <= i; j++){ // O(n)

                    if(j == 0 || j == i) pascalRow.add(1);

                    else{

                        int left = pascalTri.get(i-1).get(j-1);

                        int right = pascalTri.get(i-1).get(j);

                        // adding elements just above
                        int element = left+right;

                        pascalRow.add(element);
                    }
                }
                //add a row to Pascal's triangle
                pascalTri.add(pascalRow);
            }
            //return Pascal's triangle
            return pascalTri;
        }

        /*
        Time Complexity = O(n^2)
        Space Complexity = O(1) as no auxiliary DS used
         */

        public static void main(String[] args){

            PascalTriangle object = new PascalTriangle();

            int rowNumber = 9;

            List<List<Integer>> result = object.generate(rowNumber);

            System.out.println("Pascal's triangle is ");

            for(int i = 0; i < rowNumber; i++){

                for(int j = 0; j <= i; j++){

                    if (j != i) System.out.print(result.get(i).get(j) + ", ");
                    else System.out.print(result.get(i).get(j));

                }
                System.out.println();
            }
        }

}
