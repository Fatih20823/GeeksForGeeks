import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    
    if(num >=1){
      return num*FirstFactorial(num-1);
    }else{
    return 1;
    }
  }

  public static void main (String[] args) {      
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}
