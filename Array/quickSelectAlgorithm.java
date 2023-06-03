public class quickSelectAlgorithm {
  int findKthElement(int array[], int low, int high, int k) 
  { 
    if((k >= 0) && (k <= high - low + 1)){
      int index = randomPartition(array, low, high);
      //checks if the pivot element's index position is equal to the k'th value
      if((index - low)==(k - 1)){
        return array[index];
      }
      //if the pivot's index value is more than k'th value return left side of the pivot element
      else if((index - low) > (k - 1)){
        return findKthElement(array, low, index - 1, k);
      }
      //else return the right side of the pivots element
      else{
        return findKthElement(array, index + 1, high, k - index + low - 1);
      }
    }
    return Integer.MAX_VALUE;
  } 
//function to swap the numbers
  void swap(int array[], int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
//function to arrange the left side is lesser than pivot and right side is more than pivot
  int divideArray(int array[], int low, int high){
    int x = array[high];
    int i = low;
    for(int j = low; j <= high - 1; j++){
      if(array[j] <= x){
        swap(array, i, j);
        i++;
      }
    }
    swap(array, i, high);
    return i;
  }
//function to choose the pivot element and swap it to the last index
  int randomPartition(int array[], int l, int r){
    int n = r - l + 1;
    int pivot = (int)(Math.random())*(n - 1);
    swap(array, l , r);
    return divideArray(array, l, r); 
  }
  
  public static void main(String args[]) 
  { 
      quickSelectAlgorithm ob = new quickSelectAlgorithm(); 
      int array[] = {54, 26, 93, 17, 77, 31, 44,20,55}; 
      int n = array.length,k = 9; 
      System.out.println("K'th smallest element is "+ ob.findKthElement(array, 0, n-1, k)); 
    } 
}
