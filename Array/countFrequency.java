public class countFrequency {
  public static void countfrequenciesEfficient(int input[]) {
    int n = input.length;
    /*Decrement the elements in array by one */
    for(int i = 0; i < n; i++){
      input[i]--;
    }
    /*Use every element arr[i] as index and add 'n' to element present at arr[i]%n to keep track of count of occurrences of arr[i]  */
    for(int i = 0; i < n; i++){
      input[input[i] % n] += n;
    }
    /*To print counts, simply print the number of times n was added at index corresponding to every element */
    for(int i = 0; i < n; i++){
      System.out.println((i + 1)+ " -> " + input[i]/n);
      input[i] = input[i] % n + 1;
    }
  }

  public static void main(String[] args) {
    int[] input = { 2, 3, 3, 2, 5 };
    countfrequenciesEfficient(input);
  }
}
