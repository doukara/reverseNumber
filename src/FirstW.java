
import java.util.Scanner;


public class FirstW {
    
     static int number;
     //reverse number withe methode reverse() on class StringBuffer
    public  void revNumber(){
        
       StringBuffer item = new StringBuffer();
       System.out.print("Enter number  or Word : ");
       Scanner addNumber = new Scanner(System.in);
       item.append(addNumber.next());
       System.out.println("The reverse is : " + item.reverse());
        
        
    }    
    
}
