public class Main{
public static void main(String[] args){

  int number = 1;
  
  boolean result = true;

  String numberString = String.valueOf(number);
  
    while(numberString.length() == 0 || numberString.length() == 1){
    
      int lastIndex = numberString.length() - 1;
    
      if(numberString.charAt(0) == numberString.charAt(numberString.length() - 1)){
    
    
        numberString = numberString.substring(0, lastIndex) + numberString.substring(lastIndex + 1);
    
      } else {
    
        result = false;
        break;
        
      }
    
      System.out.println(result);
    
    
    }
  
  }
}