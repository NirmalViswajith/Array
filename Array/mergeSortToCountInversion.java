import java.util.Arrays;

public class mergeSortToCountInversion {
  private static int mergeSort(int[] array, int l, int m, int r) {
    int left[] = Arrays.copyOfRange(array, l, m+1);
    int right[] = Arrays.copyOfRange(array, m + 1, r + 1);
    int i = 0, j = 0, k = l, swaps = 0;
    while((i < left.length) && (j < right.length)){
      if(left[i] <= right[j]){
        array[k++] = left[i++];
      }
      else{
        array[k++] = right[j++];
        swaps += (m + 1) - ( l + i);
      }
    }
    while(i < left.length){
      array[k++] = left[i++];
    }
    while(j < right.length){
      array[k++] = right[j++];
    }
    return swaps;
  }
  private static int mergeSortAndCount(int[] array, int left, int right) 
    { 
      int inv_count = 0;
      if(left < right){
        int mid = (left + right)/2;
        inv_count += mergeSortAndCount(array, left, mid);
        inv_count += mergeSortAndCount(array, mid + 1, right);
        inv_count += mergeSort(array, left, mid, right);
      }
      return inv_count;
    } 
  
    public static void main(String[] args) 
    { 
      int[] array = { 9, 1, 6, 4, 5 }; 
      /*
       * 9 1 6 4 5
       * 1 9 6 4 5 -1
       * 1 6 9 4 5 -2
       * 1 6 4 9 5 -3
       * 1 6 4 5 9 -4
       * 1 4 6 5 9 -5
       * 1 4 5 6 9 -6
       * output : 6
       */
      //get inversion count by performing modified merge sort on list
      System.out.println(mergeSortAndCount(array, 0, array.length - 1)); 
    } 
}
