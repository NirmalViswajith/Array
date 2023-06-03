public class JumpGame {
  private static int Jump(int[] num) 
    { 
        int i = 0;
        int a = num[0];
        int b = num[0];
        int jump = 1;
        if(num.length == 1){
          jump = 0;
        }
        for(i = 1; i < num.length ; i++){
          if(i == num.length-1 ){
            break;
          }
          if(num[i] > b){
            b = num[i];
          }
          if(a==0){
            jump++;
            a=b;
          }
          if(b == 0){
            return 0;
          }          
          a--;
          b--;
        }
        return jump;
    } 
  
    public static void main(String[] args) 
    { 
        int num[] = { 2,3,1,1,4 }; 
  
        System.out.println("Minimum number of jumps to reach end is : "
                           + Jump(num)); 
    } 
}
/*
 *      
        int a = num[0];
        
        
        for(int i = 0; i < num.length ; i++){
          if(a >= num.length-1 ){
            if(nums[nums.length-1]==0){
              return true;
            }
            return true;
          }
          if(num[i] > b){
            b = num[i];
          }
          
          if(b == 0){
            return false;
          }          
          
          b--;
        }
        return true;
 
 */