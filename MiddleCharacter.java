public class MiddleCharacter {
  public static String getMiddle(String s) {
    final int length = s.length();
    if((length %2) == 0){
      
      System.out.print("Even");
      final int index = length/2 - 1;
      return s.substring(index,index+2);
    }
      
      System.out.print("Odd");
      final int index = length/2;
      return s.substring(index,index+1);
  }
}
   
    
