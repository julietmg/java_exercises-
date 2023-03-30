public class Solution {


public static String insertDash(int num) {
    
    String ourNumber = Integer.toString(num);
    String result = "";
    
    for(int i=0; i < ourNumber.length(); i++) {
      char current = ourNumber.charAt(i);
      
      result+= current;
      
      if(i<ourNumber.length()-1) {
        char next = ourNumber.charAt(i+1);
        
        if(isOdd(current) && isOdd(next)) {
          result += "-";
        }
      }

      System.out.println(result);
    }
    
    
    return result;
    
  }

  public static boolean isOdd(char c) {
    int num = Character.getNumericValue(c);
    return num%2 != 0; 
  }

}