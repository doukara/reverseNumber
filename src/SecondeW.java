
import java.util.Scanner;


public class SecondeW extends FirstW{
    int nmbr  ;
    @Override
    public void revNumber(){
       
       
       int num = 42, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;        
        }
         System.out.println("Reversed Number: " + reversed);
       
       
        
        
    } 
}
