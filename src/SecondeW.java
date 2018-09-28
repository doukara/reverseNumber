
import java.util.Scanner;


 class SecondW extends ReverseNumber{
    int reversed = 0 ;
    
    @Override
    public void revNumber(){      
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();
       

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;  // equivalent to num /= 10 ;      
        }
         System.out.println("Reversed Number: " + reversed);       
      
    } 

}
