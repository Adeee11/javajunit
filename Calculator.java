package com.calculator.calc;  
import java.util.Scanner;

public class Calculator {

  public static calculate(Double number1, Double number2, char operator){
    Double result;
    switch (operator) {

      case '+':
        result = number1 + number2;
      
        break;

      case '-':
        result = number1 - number2;
       
        break;

      case '*':
        result = number1 * number2;
       
        break;

      case '/':
        result = number1 / number2;
     
        break;

      default:
      
        break;
    }

    return result;
  }

  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();
    Double result = calculate(number1, number2, operator)
    System.out.println(number1 + " "+ operator +" " + number2 + " = " + result);
    input.close();
  }
}