/*
 * Josh Bartlett
 * Purpose: Fill a 4x4 matrix randomly with 1s and 0s, 
 *          then find the first row and column with the most 1s
 * June 1, 2019
 * Bellevue University
 * mostOnesMatrix.java
 */

public class mostOnesMatrix {
    public static void main(String[] args){
        
        // Declare and creat an int 4x4 matrix 
        int[][] matrix = new int[4][4];
        
        // Declare the rowMost variable to hold the row index with the most 1s
        int rowMost = 0;
        
        // Declare the most variable to compare to the 
        // total of the rows 
        int most = -1;
        
        // for loop to fill the matrix with random 1s and 0s and 
        // to find the first row with the most 1s
        for(int row = 0; row < matrix.length; row++){
            int rowTotal = 0;
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int) (Math.random() * 2) ;
                rowTotal += matrix[row][column];
            }
            if(rowTotal > most){
                rowMost = row;
                most = rowTotal;
            }
        }
       
        // Declare the colMost variable to hold the column index with the most 1s
        int colMost = 0;
        
        // Reset the most variable to -1 so that it can be 
        // used to compare the total of the columns
        most = -1;
        
        //for loop to find the first column with the most 1s
        for(int column = 0; column < matrix[0].length; column++){
            int colTotal = 0;
            for(int row = 0; row < matrix.length; row++){
                colTotal += matrix[row][column];
            }
            if(colTotal > most){
                colMost = column;
                most = colTotal;
            }
        }
        
        // for loop to print the matrix
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        
        // print a blank line 
        System.out.println();
        
        // Prints the largest row index 
        System.out.println("The largest row index: " + rowMost);
        
        // Prints the largest comumn index
        System.out.println("The largest column index: " + colMost);
    }  
}
