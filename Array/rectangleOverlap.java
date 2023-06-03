public class rectangleOverlap {
  static class Point { 
  
    int x, y; 
  } 
//Returns true if two rectangles(S, P) and (S1, P1) overlap
static  boolean checkOverlapRectangle(Point S, Point P, Point S1, Point P1) {
  //If one rectangle is on left side of other 
       if (S.x >= P1.x || S1.x >= P.x) { 
           return false; 
       } 
     //If one rectangle is above other
       if (S.y <= P1.y || S1.y <= P.y) { 
           return false; 
       } 
 
       return true; 
       /*
       one line code:
       return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] && rec1[3] > rec2[1]; 
       */
   } 

public static void main(String[] args) { 
    
    Point S = new Point(),
    P = new Point(), 
    S1 = new Point(),
    P1 = new Point(); 
    S.x=0;S.y=10; P.x=10;P.y=0; 
    S1.x=5;
    S1.y=5; 
    P1.x=15;
    P1.y=0; 

    if (checkOverlapRectangle(S, P, S1, P1)) { 
        System.out.println("Rectangles Overlap"); 
    } else { 
        System.out.println("Rectangles Don't Overlap"); 
    } 
  }  
}
