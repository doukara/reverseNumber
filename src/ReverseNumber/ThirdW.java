package ReverseNumber;


import java.util.Scanner;


public class ThirdW extends ReverseNumber {

    @Override
    void revNumber() {
        int reversed = 0 ;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();
        int i =0;
        for(;num != 0;i++)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10 ;  // equivalent to num /= 10 ; 
        }
        System.out.println("Reversed Number : " + reversed);
    }
    
}
