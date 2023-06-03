import java.util.Arrays;

public class digitReArrangementMethod {
  static void swap(char array[], int i, int j){
    char temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  static void findNextNumber(char array[], int n)  
    { 
      int i;
      /*this function whether i'th elemnt is greater than i-1'th element. if so it will break the loop and return i'th and i-1'th value */
      for(i = n-1;i > 0; i--){
        if(array[i] > array[i-1]){
          break;
        }
      }
      if(i == 0){
        return ;
      }else{
        /*after getting both values the function will return to the last index and swap the values of array[min] and array[i-1]'th value then sort the array from array[i]-array[min] */
        int x = array[i-1],min = i;
        for(int j = i + 1;j<n;j++){
          if(array[j] > x && array[j] < array[min]){
            min = j;
          }
        }
        swap(array,i-1,min);
        Arrays.sort(array,i,n);
        System.out.println(array);
      }
    } 
    /*the process is 
     * ->2 1 8 7 6 5
     * ->2 5 8 7 6 1
     * ->2 5 1 6 7 8
     */
  
    public static void main(String[] args)  
    { 
        char array[] = { '2','1','8','7','6','5' }; 
        int n = array.length; 
        findNextNumber(array, n); 
    } 
}
