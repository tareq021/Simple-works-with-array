// This Programme asks for the dimension the matrix. Then asks for the value
// After that it show some result based on the value

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwitharray;

import java.util.Scanner;

/**
 *
 * @author Tareq
 */
public class WorkWithArray 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int row;
        int col;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Rows: ");
        row = input.nextInt();
        
        System.out.println("Col: ");
        col = input.nextInt();
        
        
        int arrayTwoD[][] = new int [row][col];
        
        // Receiving Data from User
        for(int init_row = 0; init_row < row; init_row++)
        {
            for(int init_col = 0; init_col < col; init_col++)
            {
                arrayTwoD [init_row][init_col] = input.nextInt();
            }
        }
        
        
        System.out.println("The Matrix you entered: ");
        
        // Showing the Matrix
        for (int init_row = 0; init_row < row; init_row ++)
        {
            for (int init_col = 0; init_col < col; init_col++)
            {
                System.out.print(arrayTwoD [init_row][init_col] + " ");
            }
            
            System.out.println("");
        }
        
        
        
        // Finding the Minimum
        for (int init_row = 0; init_row < row; init_row ++)
        {
            int min = arrayTwoD[init_row][0];
            for (int init_col = 1; init_col < col; init_col++)
            {
                if (min > arrayTwoD[init_row][init_col])
                {
                    min = arrayTwoD[init_row][init_col];
                }
            }
            System.out.println("Minmum at Row "+ (init_row+1) +": " +min);
        }
        
        // Finding the Maximum
        for (int init_row = 0; init_row < row; init_row ++)
        {
            int max = arrayTwoD[init_row][0];
            for (int init_col = 1; init_col < col; init_col++)
            {
                if (max < arrayTwoD[init_row][init_col])
                {
                    max = arrayTwoD[init_row][init_col];
                }
            }
            System.out.println("Maximum at Row "+ (init_row+1) +": " +max);
        }
        
        // Finding the Avarage
        
        for (int init_row = 0; init_row < row; init_row ++)
        {
            int sum = 0;
            for (int init_col = 0; init_col < col; init_col++)
            {
                sum = sum + arrayTwoD[init_row][init_col];
            }
            System.out.println("Avarage at Row "+ (init_row+1) +": " + sum/row);
        }
        
        // Diagonal Sum
        
        int sum = 0;
        for (int init_row = 0, init_col = 0; init_row < row; init_row ++, init_col++)
        {
            sum = sum + arrayTwoD[init_row][init_col];
        }    
            
        System.out.println("Diagonal Sum "+ sum);
        
              
                
        // Sum of the values above 20
        
        int maxValue = 0;
        int maxSum[] = new int [row];
        int token =  maxSum[0];
        int trackRow[] = new int [row];
        int count;
        
        for (int init_row = 0, counter = 0; init_row < row; init_row ++, counter++)
        {
            sum = 0;
            count = 0;
            for (int init_col = 0; init_col < col; init_col++)
            {
                if (arrayTwoD[init_row][init_col] > 20)
                {
                   sum = sum + arrayTwoD[init_row][init_col];
                   maxSum[init_row] = sum;
                   trackRow[counter] = init_row;
                   count++;
                }
                if(token < maxSum[init_row])
                {
                    token = maxSum[init_row];
                    maxValue = trackRow[counter];
                }
                    
                    
            }
            System.out.println((init_row+1) +" has "+ count+ " above 20 values of which the total sum is " + sum);
            
            
        }
       System.out.println((maxValue+1) + " has the max values of above 20");
        
    }// main ends here
    
}
