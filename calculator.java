/*⦁	Write a Java program that works as a simple calculator.
 *  Use a switch statement to accept 2 numbers and an operator 
 *  for the +, -,*, % operations. Perform arithmetic operation display the result.
 *   Handle any possible exceptions like divided by zero for division operation*/
 */
package lab_projects;
import java.util.*;
class calculator
{
    public static void main(String[] args)
    {
        int a,b;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,op: ");
        a=sc.nextInt();
        b=sc.nextInt();
        op=sc.next().charAt(0);
        switch(op)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
            	System.out.println(a%b);
            	break;
            default:
            System.out.println("Invalid operator");
        }
        try
        {
            int c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator cant be zero");
        }
    }
}
