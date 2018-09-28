
import java.util.Scanner;


public class SecondeW extends ReverseNumber{
    int nmbr  ;
    
    @Override
    public void revNumber(){
       int reversed = 0;
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();
       

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;        
        }
         System.out.println("Reversed Number: " + reversed);       
      
    } 

}
