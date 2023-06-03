public class MaximumVlaue {
  static int findMaximum(int array[], int start, int end) 
    { 
      if(start == end){
        return start;
      }
      int mid = (start + end)/2;
      if(array[mid] > array[mid+1] && array[mid] > array[mid-1]){
        return array[mid];
      }else if(array[mid] > array[mid + 1] && array[mid] < array[mid - 1]){
        return findMaximum(array, start, mid);
      }else{
        return findMaximum(array, mid+1, end);
      }
    }
     
      
   
    public static void main (String[] args)  
    { 
        int array[] = {3, 5,15, 50, 11, 10, 8, 6}; 
        int n = array.length; 
        System.out.println("The maximum Value "+  findMaximum(array, 0, n-1)); 
    } 
}
