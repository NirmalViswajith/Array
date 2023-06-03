import java.util.Arrays;

public class SegregationLogic {
  public static void Sort012(int[] array, int end) {
    int low=0;
    int mid=0;
    int high=array.length-1;
    while(mid <= high){
      if(array[mid] == 0){
        swap(array, low, mid);
        low++;
        mid++;
      }
      else if(array[mid] == 2){
        swap(array, mid, high);
        high--;
      }else{
        mid++;
      }
    }
 }
 public static void swap(int[] array, int i, int j){
  int temp = array[i];
  array[i] = array[j];
  array[j] = temp;
 }

  public static void main(String[] args) {
    int[] array = { 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

    Sort012(array, array.length - 1);
    System.out.println(Arrays.toString(array));
 }
}
