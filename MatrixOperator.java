/**
 * Title:            Matrix Operator
 * Files:            MatrixOperator.java
 * Semester:         2-B
 *
 * Author:           Alberto Ocaranza
 * Email:            alt.ocaranza@gmail.co
 * Coments from:     http://pages.cs.wisc.edu/~cs302/resources/guides/commenting.html
**/

import java.util.Random;

class MatrixOperator{
    private int MAX_SIZE = 2;
    public int[][] matrix_w = new int[MAX_SIZE][MAX_SIZE];
    public int[][] matrix_v = new int[MAX_SIZE][MAX_SIZE];
    public int[][] matrix_z = new int[MAX_SIZE][MAX_SIZE];
    // Random matrix constructor
    public MatrixOperator(){
        this.matrix_w = this.poblate_matrix(this.matrix_w);
        this.matrix_v = this.poblate_matrix(this.matrix_v);
        this.matrix_z = this.poblate_matrix(this.matrix_z);
    }   
    // Custom matrix constructor
    public MatrixOperator(int[][] m_v, int[][] m_w, int[][] m_z, int max){
        this.MAX_SIZE = max;
        this.matrix_v = m_v;
        this.matrix_w = m_w;
        this.matrix_z = m_z;
    }   
    // Matrix comparator
    public boolean matrix_comparator(int[][] matrix_a, int[][] matrix_b){
        int[][] matrix_product = new int[MAX_SIZE][MAX_SIZE];
        for(int i = 0; i <= MAX_SIZE - 1; i++){
            for(int j = 0; j <= MAX_SIZE - 1; j++){
                if(matrix_a[i][j] != matrix_b[i][j]){
                    return false;
                }
            }
            System.out.println("");
        }  
        return true;
    }
    // Matrix scalar multiplication
    public int[][] matrix_scalar(int[][] matrix_a, int scalar){
        int[][] matrix_product = new int[MAX_SIZE][MAX_SIZE];
        for(int i = 0; i <= MAX_SIZE - 1; i++){
            for(int j = 0; j <= MAX_SIZE - 1; j++){
                matrix_product[i][j] = matrix_a[i][j] * scalar;
            }
            System.out.println("");
        }  
        return matrix_product;
    }
    // Matrix sum
    public int[][] matrix_sum(int[][] matrix_a, int[][] matrix_b){
        int[][] matrix_product = new int[MAX_SIZE][MAX_SIZE];
        for(int i = 0; i <= MAX_SIZE - 1; i++){
            for(int j = 0; j <= MAX_SIZE - 1; j++){
                matrix_product[i][j] = matrix_a[i][j] + matrix_b[i][j];
            }
            System.out.println("");
        }  
        return matrix_product;
    }
    // Matrix multiplicator
    public int[][] matrix_multiplicator(int[][] matrix_a, int[][] matrix_b){
        int[][] matrix_product = new int[MAX_SIZE][MAX_SIZE];
        for(int i = 0; i <= MAX_SIZE - 1; i++){
            for(int j = 0; j <= MAX_SIZE - 1; j++){
                matrix_product[i][j] = matrix_a[i][j] * matrix_b[i][j];
            }
            System.out.println("");
        }  
        return matrix_product;
    }
    // Matrix inverter
    public int[][] matrix_inverter(int[][] matrix_a){
        int[][] matrix_product = new int[MAX_SIZE][MAX_SIZE];
        for(int i = 0; i <= MAX_SIZE - 1; i++){
            for(int j = 0; j <= MAX_SIZE - 1; j++){
                matrix_product[i][j] = matrix_a[i][j] * -1;
            }
            System.out.println("");
        }  
        return matrix_product;
    }
    // Matrix printer
    public void matrix_printer(int[][] matrix){
        for(int i = 0; i <= MAX_SIZE - 1; i++){
            for(int j = 0; j <= MAX_SIZE - 1; j++){
                System.out.print(matrix[i][j]);
                if(j == 0){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }   
    }
    // Poblate matrix with random numbers
    private int[][] poblate_matrix(int[][] matrix){
        for(int i = 0; i <= MAX_SIZE - 1; i++){
            for(int j = 0; j <= MAX_SIZE - 1; j++){
                matrix[i][j] = this.generate_value();
            }
        }   
        return matrix;
    }
    // Generate random index values
    private int generate_value(){
        Random random = new Random();
        int number = 0 + random.nextInt(20);
        return number;
    }
}