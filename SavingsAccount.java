/*⦁	Create class SavingsAccount. Use a static variable annualInterestRate
 *  to store the annual interest rate for all account holders. 
 *  Each object of the class contains a private instance variable savingsBalance
 *   indicating the amount the saver currently has ondeposit. 
 *   Provide method calculateMonthlyInterest to calculate the monthly interest 
 *   by multiplying the savingsBalance by annualInterestRate divided by 12 this interest  
 *   should  be  added  to  savingsBalance.  Provide  a  static  method 
 *   modifyInterestRate that sets the annualInterestRate to a new value.
 */

package lab_projects;
import java.util.Scanner;
class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    SavingsAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial balance: ");
        savingsBalance = sc.nextDouble();
    }
    void calculateMonthlyInterest() {
        double interest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += interest; 
        System.out.println("Monthly Interest: " + interest);
        System.out.println("New Balance: " + savingsBalance);
    }
    static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate; // Set the new interest rate
        System.out.println("Annual Interest Rate updated to: " + annualInterestRate);
    }

    public static void main(String[] args) {
        modifyInterestRate(0.09);
        SavingsAccount account = new SavingsAccount();
        account.calculateMonthlyInterest(); 
        }
    
}
