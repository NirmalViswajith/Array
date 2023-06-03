import java.util.Scanner;

public class pattern {
  public static void printPattern(int n){
    for(int i = 1; i < n; i++){
      for(int j = i; j < n; j++){
        System.out.print("*");
      }
      for(int j = i + 1; j <= n - i; j++){
        System.out.print(" ");
      }
      for(int j = i; j < n; j++){
        System.out.print("*");
      }
    }
  }
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    int n = number.nextInt();
    printPattern(n);
  }
}


