import java.util.ArrayList;

public class stockBuySell {
  static class Result { 
    int buy, sell; 
  }
  void findProfit(int array[], int n) { 
    if(n == 1){
      return;
    } 
    int count = 0;
    ArrayList<Result> result = new ArrayList<>();
    int i;
    for(i = 0; i < array.length; i++){
      //Find Local Minima Note that the limit is (n-2) as we are comparing present element to the next element
      while ((i < n - 1) && (array[i + 1] <= array[i])){
        i++;
      }
      if(i == n - 1){
        break;
      }
      Result temp = new Result(); 
      //Store the index of the minima i.e. store the day(index number) to buy stack
      temp.buy = i++; 
      //Find Local Maxima Note that we are comparing the previou element
      while ((i < n) && (array[i] >= array[i - 1])){
        i++; 
      }
      //Store the index of the maxima i.e. store the day(index number) we want to sell the stack
      temp.sell = i - 1;
      result.add(temp);
      count++;
      i--;
    }
    if (count == 0){
      System.out.println("Stack cant be bought");
    }else{
      for (int j = 0; j < count; j++){
        System.out.println("Buy on day: " + result.get(j).buy +" Sell on day : " + result.get(j).sell); ;
      }
    }
    return;
  } 
  
  public static void main(String args[]) { 
    stockBuySell stock = new stockBuySell(); 
    int array[] = { 98, 178, 250, 300, 40, 540, 690 }; 
    int n = array.length; 
    stock.findProfit(array, n); 
  } 
}
