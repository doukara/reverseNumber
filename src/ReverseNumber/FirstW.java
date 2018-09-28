package ReverseNumber;


import java.util.Scanner;


public class FirstW extends ReverseNumber {
    
     static int number;
     //reverse number withe methode reverse() on class StringBuffer
     @Override
    public   void revNumber(){
        
       StringBuffer item = new StringBuffer();
       System.out.print("Enter number  or Word : ");
       Scanner addNumber = new Scanner(System.in);
       item.append(addNumber.next());
       System.out.println("Reversed Number : " + item.reverse());               
        
    }    
    
}
