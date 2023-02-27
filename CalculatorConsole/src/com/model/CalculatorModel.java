package com.model;
//public class CalculatorModel {
//
//    private String input;
//    private double result;
//
//
//    private int firstNumber;
//    private int secondNumber;
//
//    public void setFirstNumber(int firstNumber) {
//        this.firstNumber = firstNumber;
//    }
//
//    public void setSecondNumber(int secondNumber) {
//        this.secondNumber = secondNumber;
//    }
//
//    public int add() {
//        return firstNumber + secondNumber;
//    }
//
//    public int subtract() {
//        return firstNumber - secondNumber;
//    }
//
//    public int multiply() {
//        return firstNumber * secondNumber;
//    }
//
//    public int divide() {
//        try {
//            if (secondNumber == 0) {
//                throw new ArithmeticException("Division by zero");
//            }
//            return firstNumber / secondNumber;
//        } catch (ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//            return 0; 
//        }
////		return firstNumber;
//    }
//
//
//}

import java.util.Stack;

public class CalculatorModel {

    private double result;

    private int firstNumber;
    private int secondNumber;

	private String input;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public int subtract() {
        return firstNumber - secondNumber;
    }

    public int multiply() {
        return firstNumber * secondNumber;
    }

    public int divide() {
        try {
            if (secondNumber == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0; 
        }
    }
    
    public double sin(double angle) {
        return Math.sin(angle);
    }
    
    public double cos(double angle) {
        return Math.cos(angle);
    }
    
    public double tan(double angle) {
        return Math.tan(angle);
    }
    
    public double sqrt(double number) {
        return Math.sqrt(number);
    }
    
    public double evaluateExpression(String expression) {
        Stack<Double> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i++));
                }
                i--;
                stack.push(Double.parseDouble(sb.toString()));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                double b = stack.pop();
                double a = stack.pop();
                
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        
        return stack.pop();
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }


	}


