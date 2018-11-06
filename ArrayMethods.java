public class ArrayMethods{


   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     int sum = 0;
     if(x >= ary.length){
       return sum;
     }
     for(int y = 0; y < ary[x].length; y++){
       sum+=ary[x][y];
     }
     return sum;
   }
    //returns the sum of the elements in Row x of ary.
    //When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)

   public static int columnSum(int[][] ary, int y){
     int sum = 0;
     for(int x = 0; x < ary.length; x++){
       if(y < ary[x].length){
         sum+=ary[x][y];
       }
     }
     return sum;
   }
    //returns the sum of the elements in Column y of ary (careful with rows of different lengths!).
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)

   /*
   *PART 2 - use prior methods where appropriate
   */
   public static int[] allRowSums(int[][] ary){
     int[] sums = new int[ary.length];
     for(int x = 0; x < ary.length; x++){
       sums[x] = rowSum(ary, x);
     }
     return sums;
   }
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.

    public static int[] allColSums(int[][] ary){
      int largest = 0;
      for(int x = 0; x < ary.length; x++){
        if(largest < ary[x].length){
          largest = ary[x].length;
        }
      }
      int[] sums = new int[largest];
      for(int y = 0; y < largest; y++){
        sums[y] = columnSum(ary, y);
      }
      return sums;
    }
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.


   /*
   *PART 3 - use prior methods where appropriate
   */
   public static boolean isRowMagic(int[][] ary){
     return true;
   }
     //checks if the array is row-magic (this means that every row has the same row sum).

   public static boolean isColumnMagic(int[][] ary){
     return true;
   }
    //checks if the array is column-magic (this means that every column has the same column sum).

}
