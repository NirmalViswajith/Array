import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class dsThatSupportInsertDeleteRandom {
  ArrayList<Integer> array;   
   //My second Data Structure to perform all operations in O(1) Time
   HashMap<Integer, Integer>  hash; 
  
   public dsThatSupportInsertDeleteRandom() 
   { 
       array = new ArrayList<Integer>(); 
       hash = new HashMap<Integer, Integer>(); 
   } 
  //Inserting value in data structure involve two operations
  //addition in the arraList and inserting entry in HashMap
   void insert(int Num) 
   { 
    if(hash.get(Num) != null){
        return;
    }
    int size = array.size();
    array.add(Num);
    hash.put(Num, size);
   } 
  //Removing element is Tricky and most imp 
   void remove(int Num) 
   { 
       int index = hash.get(Num);
       hash.remove(Num);
       int size = array.size();
       Integer last = array.get(size - 1);
       Collections.swap(array, index, size - 1);
       array.remove(size - 1);
       hash.put(last, index);
    } 
    //Returns the ransom element from array 
    int getRandom() 
    { 
       Random rand = new Random(); 
       //find any random number
       //randomly choosing an index from array.size()
       int index = rand.nextInt(array.size()); 
       
       return array.get(index); 
    } 
  
    Integer search(int Num) 
    { 
        return hash.get(Num);
    } 

  
public static void main (String[] args) 
{ 
    dsThatSupportInsertDeleteRandom ds = new dsThatSupportInsertDeleteRandom(); 
    ds.insert(12); 
    ds.insert(16); 
    ds.insert(14); 
    ds.insert(20);
    ds.insert(30);
    System.out.println(ds.search(30)); 
    ds.remove(14); 
    System.out.println(ds.search(20)); 
    System.out.println(ds.getRandom()); 
} 
}
