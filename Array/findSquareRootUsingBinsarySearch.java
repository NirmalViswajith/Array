public class findSquareRootUsingBinsarySearch {
  public static int Sqrt(int Num) 
    {   
      if(Num == 0 || Num == 1){
        return Num;
      }
      int start = 1, end = Num, result = 0;
      while(start <= end){
        int mid = (start + end)/2;
        if(mid*mid == Num){
          return mid;
          //instead of mid*mid we are giving x/mid to tackle overflow of integer range when multiplying with bigger numbers
        }else if(mid <= Num/mid){
          start = mid + 1;
          result = mid;
        }else{
          end = mid - 1;
        }
      }
      return result;
    } 
    public static void main(String args[])
    { 
      int Num = 2147395599; 
      System.out.println(Sqrt(Num)); 
    } 
}
