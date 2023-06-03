public class upperTriangleOrNot {
  public static Boolean isUpperTriangle(int mat[][], int m, int n){
    for(int i = 1; i < m; i++){
      for(int j = 0;j < i; j++){
        if(mat[i][j]!=0){
          return false;
        }
      }
    }
    return true;
  }
  public static Boolean isLowerTriangle(int mat[][], int m, int n){
    for(int i = 0; i < m; i++){
      for(int j = i + 1; j < n; j++){
        if(mat[i][j] != 0){
          return false;
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int[][] mat = {{1,0},{1,1}};
    int m = mat.length;
    int n = mat[0].length;
    if(isUpperTriangle(mat,m,n)){
      System.out.println("it is an upper triangle");
    }else if(isLowerTriangle(mat,m,n)){
      System.out.println("it is an lower triangle");
    }
    else{
      System.out.println("it not upper triangle or loweer triangle");
    }
  }
}
