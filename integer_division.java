/*⦁	Write a Java program that perform integer divisions. 
 * The user enters two numbers, Num1 and Num2. 
 * The division of Num1 and Num 2 is displayed in the Result. 
 * If Num1 or Num2 were not an integer, the program would throw a Number Format Exception.
 *  If Num2 were Zero, the program would throw an Arithmetic Exception. 
 */
package lab_projects;
import java.util.*;
class integer_division
{
    public static void main(String s[])
    {
        String num1,num2;
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbers : ");
       num1=sc.next();
       num2=sc.next();
       try
       {
           int a=Integer.parseInt(num1);
           int b=Integer.parseInt(num2);
           int res=a/b;
           System.out.println("Result "+"=" + res);
       }
       catch(ArithmeticException e)
       {
           System.out.println("Denominator cannot be zero ");
       }
       catch(NumberFormatException e)
       {
           System.out.println("Only integers should be given as inputs ");
       }
        
    }
}
