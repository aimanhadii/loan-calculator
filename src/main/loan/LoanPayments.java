package loan;
import java.util.Scanner;
/**
 *
 //sheikh aiman hadi bin shekh faisal 2212729
 // Muhammad Altamis Arief Bin Mohd Zahry 2212857
 */
public class LoanPayments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int loanAmount,numOfYears;
        final double monthlyInterestRate = 2.3;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print(" Enter loan amount : ");
         loanAmount = input.nextInt();
         
         System.out.print(" Enter number of years : ");
         numOfYears = input.nextInt();
         
         System.out.print("Monthly payment for the loan is : ");
         System.out.println((loanAmount*monthlyInterestRate)/(1-(1/Math.pow(1+ monthlyInterestRate,numOfYears*12))));
         
         input.close();
         
        
//        i love java
        
    }
    
}
