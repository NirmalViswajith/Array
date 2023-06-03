public class minimumWindowSubstring {
  static final int no_of_chars = 256; 
      
  static String findMinWindow(String str, String pat) 
  { 
    //calculates the stirng length of str
    int str_len = str.length();
    int ptr_len = pat.length();
    if(str_len < ptr_len){
      System.out.println("Windows doesnt exist");
      return " ";
    }       
    int[] ascii_str = new int[no_of_chars];
    int[] ascii_ptr = new int[no_of_chars];
    //iterates over the pat string and stores the string values of pat randomly at ascii_ptr[] 
    for(int i = 0; i < ptr_len; i++){
      ascii_ptr[pat.charAt(i)]++;
    }
    int start = 0, start_index = -1, min_len = Integer.MAX_VALUE, count = 0;
    //iterates over the str string and stores the string values of str randomly at ascii_str[]
    for(int j = 0; j < str_len; j++){
      ascii_str[str.charAt(j)]++;
      // it checks whether the str character string at index j is present in the ascii_ptr or not and if its present then it checks whether the character value at ascii_ptr is less than or equal to the ascii_ptr. if yes then increment the count
      if((ascii_ptr[str.charAt(j)] != 0) && (ascii_str[str.charAt(j)] <= ascii_ptr[str.charAt(j)])){
        count++;
      }
      if(count == ptr_len){
        while((ascii_str[str.charAt(start)] > ascii_ptr[str.charAt(start)]) || (ascii_ptr[str.charAt(start)] == 0)){
          if(ascii_str[str.charAt(start)] > ascii_ptr[str.charAt(start)]){
            ascii_str[str.charAt(start)]--;
          }
          start++;
        }
        int len_window = j - start + 1;
        if(min_len > len_window){
          min_len = len_window;
          start_index = start;
        }
      }
    } 
    if(start_index == -1){
      System.out.println("windows does'nt exist");
      return " ";
    }
    return str.substring(start_index, start_index + min_len);
  } 
      
  public static void main(String[] args) 
  { 
    String str = "ADOBECODEBANC"; 
    String pat = "ABC";     
    System.out.print("Smallest window is :\n " + findMinWindow(str, pat)); 
  } 
}
