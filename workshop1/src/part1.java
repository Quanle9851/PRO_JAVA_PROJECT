
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class part1 {
    public static void main(String[] args){
        int rows;
        int colum;
        int matrix[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        rows=sc.nextInt();
        System.out.println("Enter number of columns:");
        colum=sc.nextInt();
        matrix=new int[rows][colum];
        System.out.println("Enter the element of matrix!");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colum;j++){
                System.out.println("\nMatrix["+(i+1)+"]["+(j+1)+"]=");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix inputted:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colum;j++){
                System.out.format("%3d",matrix[i][j]);
            }
            System.out.println("\n");
        }
        int sum=0;
        for(int i=0; i<rows; i++){
            for(int j=0;j<colum;j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println("Sum of matrix:"+sum);
        System.out.println("Average of matrix:"+(float)sum/(rows*colum));
        
    }
    
}
