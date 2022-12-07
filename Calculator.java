import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        char operator;              //Operators + - / *
        double num1 , num2, result; //Numbers

        Scanner input = new Scanner(System.in);

        while(0 < 1) {
        System.out.println("Write your operation ...");
        num1 = input.nextDouble();
        operator = input.next().charAt(0);
        num2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result is " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result is " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result is " + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println("Result is " + result);
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
    }
}
