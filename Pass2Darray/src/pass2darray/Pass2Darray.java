package pass2darray;
public class Pass2Darray {
    //method that displays the 2D array
    private static void showArray(int[][] array)  {
      for (int row = 0; row < array.length; row++)      {
         for (int col = 0; col < array[row].length; col++)
            System.out.print(array[row][col] + " ");
            System.out.println();
      }
   }
    //method that calculates and returns sum of 2D array elements
  private static int arraySum(int[][] array)   {
      int total = 0;   // Accumulator
      for (int row = 0; row < array.length; row++) {
         for (int col = 0; col < array[row].length; col++)
            total += array[row][col];
      }
      return total;
   }

    public static void main(String[] args) {
        //declare 2D array of 3 rows and 4 columns
        int[][] numbers = { { 1,  2,  3,  4  },
                          { 5,  6,  7,  8  },
                          { 9, 10, 11, 12  } };
        System.out.println("Here are the values in the array.");
        showArray(numbers); //method call
        System.out.println("The sum of the values " + "is " + arraySum(numbers));

    }
    
}
