// import java.io.*;
import java.util.*;
 
class GFG {
  static String swap(String str, int i, int j)
  {
    StringBuilder sb = new StringBuilder(str);
    sb.setCharAt(i, str.charAt(j));
    sb.setCharAt(j, str.charAt(i));
    return sb.toString();
  }
 
  
  public static int maximizedNumber(int num)
  {
    
    String s = Integer.toString(num);
 
    
    for (int i = 0; i < s.length(); i++) {
      int maxi = s.charAt(i) - '0';
      int idx = i;
 
     
      for (int j = i + 1; j < s.length(); j++) {
 
        
        if (maxi % 2 == 0
            && (s.charAt(j) - '0') % 2 == 0) {
 
          
          if (s.charAt(j) - '0' > maxi) {
            maxi = s.charAt(j) - '0';
            idx = j;
          }
        }
 
        
        else if (maxi % 2 == 1
                 && (s.charAt(j) - '0') % 2 == 1) {
 
        
          if (s.charAt(j) - '0' > maxi) {
            maxi = s.charAt(j) - '0';
            idx = j;
          }
        }
      }
 
      
      s = swap(s, i, idx);
    }
 
    // Convert string into integer
    return Integer.parseInt(s);
  }
 
  public static void main(String[] args)
  {
    int N = 6587;
 
    // Function call
    System.out.print(maximizedNumber(N));
  }
}