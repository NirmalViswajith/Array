public class rotateMatrixBy90Degree {
  static int N = 4; 
// In-place rotate it by 90 degrees in clockwise direction 
  static void matrixRotation(int matrix[][]) 
  { 
    for(int i = 0; i < N/2; i++){
      for(int j = i; j < N - i - 1; j++){
        int temp = matrix[j][N-i-1];
        matrix[j][N-i-1] = matrix[i][j];
        matrix[i][j] = matrix[N-j-1][i];
        matrix[N-j-1][i] = matrix[N-i-1][N-1-j];
        matrix[N-i-1][N-j-1] = temp;
      }
    }
  } 
  
  static void printMatrix(int matrix[][]) 
  {  
    for (int i = 0; i < N; i++) 
    { 
        for (int j = 0; j < N; j++) 
        System.out.print( matrix[i][j] + " "); 
        System.out.println(); 
    } 
  } 
  
  
  public static void main (String[] args){ 
    int matrix[][] = { { 1, 2, 3, 4 }, 
                      { 5, 6, 7, 8 }, 
                      { 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16 } }; 
    matrixRotation(matrix); 
    printMatrix(matrix); 
  } 
}
