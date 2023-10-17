import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter operator:");
        char op=input.next().charAt(0);
        double sum;
        double  diffrence;
        double  product;
        double quotient;
        double factorial;
        switch (op){
            case '+':
                System.out.println("enter the first number:");
                double num1 = input.nextDouble();
                System.out.println("enter the second number:");
                double  num2 = input.nextDouble();
                sum= num1+num2;
                System.out.println(sum);
                break;
            case '-':
                System.out.println("enter the first number:");
                 num1 = input.nextDouble();
                System.out.println("enter the second number:");
                 num2 = input.nextDouble();
                diffrence= num1 - num2;
                System.out.println(diffrence);
                break;
            case '*':
                System.out.println("enter the first number:");
                 num1 = input.nextDouble();
                System.out.println("enter the second number:");
                 num2 = input.nextDouble();
                product= num1 * num2;
                System.out.println(product);
                break;
            case '/':
                System.out.println("enter the first number:");
                 num1 = input.nextDouble();
                System.out.println("enter the second number:");
                 num2 = input.nextDouble();
                if (num2 == 0) {
                    System.out.println("undefiend");
                }
                    else {
                    quotient = num1/num2;
                    System.out.println(quotient);
                    }
            case '!':
                System.out.println("enter a non negative number");
                 num1 = input.nextDouble();
                if (num1< 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                }
                else {
                    factorial = 1;
                    for (int i = 1; i <= num1; i++) {
                        factorial *= i;
                        System.out.println( factorial);
                    }
                }








        }


    }

}