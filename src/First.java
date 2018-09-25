
import java.util.Scanner;


public class First {
    
    static int  number;
    public static void fun(){
    
       System.out.println("Enter number : ");
       Scanner addNumber = new Scanner(System.in);
       number = addNumber.nextInt();
        
        
         
       
       for (int i=number;number<i;i--){
           System.out.print("the reverse number is : " + number);
       }
       
    }    
    
}
