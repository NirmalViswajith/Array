public class lexographicalOrder {
  static void utilityFunction(int array[], int n)  
  { 
    int mid = n/2;
    int i = mid - 1;
    int j = (n % 2 == 1)? mid + 1: mid;
    boolean leftSmaller = false;
    while((i >= 0) && (array[i] == array[j])){
      i--;
      j++;
    }
    if((i < 0) || (array[i] < array[j])){
      leftSmaller = true;
    }
    while(i >= 0){
      array[j++] = array[i--];
    }
    if(leftSmaller){
      int carry = 1;
      if(n % 2 == 1){
        array[mid] += 1;
        carry = array[mid]/10;
        array[mid] %= 10;
      }
      i = mid - 1;
      j = (n % 2 == 1)? mid + 1: mid;
      while((i >= 0) && (carry > 0)){
        array[i] += carry;
        carry = array[i]/10;
        array[i] %= 10;
        array[j] = array[i];
        j++;
        i--;
      }
    }
  } 

     //The function that prints next palindrome of a given number array[] with n digits.
  static void nextPalindromeProblem(int array[], int n)  
  { 
    System.out.println("Next palindrome is: ");
    if(isAll9(array,n)){
      System.out.println("1");
      for(int i = 0; i < n - 1; i++){
        System.out.println("0");
      }
      System.out.println("1");
    }
    else{
      utilityFunction(array, n);
      printarray(array);
    }
  } 

  static boolean isAll9(int array[], int n){
    for(int i = 0; i < n; i++){
      if(array[i] != 9){
        return false;
      }
    }
    return true;
  }
  
  static void printarray(int array[]) { 
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
      } 
      System.out.println(); 
  } 
  
  public static void main(String[] args)  
  { 
    int array[] = { 2,1,3,3 }; 
    nextPalindromeProblem(array, array.length); 
  } 
}
