package com.controller;

import java.util.Scanner;
import java.util.Stack;

import com.model.CalculatorModel;
import com.view.CalculatorView;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculateAddition() {
        model.setFirstNumber(view.getFirstNumber());
        model.setSecondNumber(view.getSecondNumber());
        int result = model.add();
        view.showAdditionResult(result);
    }

    public void calculateSubtraction() {
        model.setFirstNumber(view.getFirstNumber());
        model.setSecondNumber(view.getSecondNumber());
        int result = model.subtract();
        view.showSubtractionResult(result);
    }

    public void calculateMultiplication() {
        model.setFirstNumber(view.getFirstNumber());
        model.setSecondNumber(view.getSecondNumber());
        int result = model.multiply();
        view.showMultiplicationResult(result);
    }

    public void calculateDivision() {
        model.setFirstNumber(view.getFirstNumber());
        model.setSecondNumber(view.getSecondNumber());
        int result = model.divide();
        view.showDivisionResult(result);
    }
    public void calculateSin() {
        double num = view.getAngle();
        double result = model.sin(num);
        view.showSinResult(result);
    }
    
    public void calculateCos() {
        double num = view.getAngle();
        double result = model.cos(num);
        view.showCosResult(result);
    }
    
    public void calculateTan() {
        double num = view.getAngle();
        double result = model.tan(num);
        view.showTanResult(result);
    }
    
    public void calculateSqrt() {
        double num = view.getNumber();
        double result = model.sqrt(num);
        view.showSquareRootResult(result);
    }
    
//    public  void calculateExpression() {
//      String expression = view.getExpression();
//        Scanner scanner = new Scanner(expression);
//        double result = 0;
//        String operator = "";
//        while (scanner.hasNext()) {
//            String next = scanner.next();
//            if (isNumeric(next)) {
//                double num = Double.parseDouble(next);
//                if (operator.equals("")) {
//                    result = num;
//                } else {
//                    switch (operator) {
//                        case "+":
//                            result += num;
//                            break;
//                        case "-":
//                            result -= num;
//                            break;
//                        case "*":
//                            result *= num;
//                            break;
//                        case "/":
//                            result /= num;
//                            break;
//                    }
//                }
//            } else {
//                operator = next;
//            }
//        }
//        view.showExpressionResult(result);
//    }
//    
//    private static boolean isNumeric(String strNum) {
//        try {
//            double d = Double.parseDouble(strNum);
//        } catch (NumberFormatException | NullPointerException nfe) {
//            return false;
//        }
//        return true;
//    }
//    public void evaluateExpression() {
//        model.setInput(view.getExpression());
//        double result = evaluate(model.getInput());
//        view.showExpressionResult(result);
//    }
//
//    private double evaluate(String expression) {
//        // Code to evaluate the expression
//        // You can implement this using the shunting yard algorithm or recursive descent parsing
//        // Here, we will assume that the expression is a simple arithmetic expression
//        // consisting of two operands and one operator
//        String[] tokens = expression.split(" ");
//        int firstNumber = Integer.parseInt(tokens[0]);
//        int secondNumber = Integer.parseInt(tokens[2]);
//        char operator = tokens[1].charAt(0);
//        switch (operator) {
//            case '+':
//                return firstNumber + secondNumber;
//            case '-':
//                return firstNumber - secondNumber;
//            case '*':
//                return firstNumber * secondNumber;
//            case '/':
//                if (secondNumber == 0) {
//                    throw new ArithmeticException("Division by zero");
//                }
//                return (double) firstNumber / secondNumber;
//            default:
//                throw new IllegalArgumentException("Invalid operator: " + operator);
//        }
//    }
//}
//
////    public void evaluateExpression() {
////        String input = view.getInput();
////        try {
////            // Evaluate arithmetic expression
////            int result = evaluate(input);
////            view.showExpressionResult(result);
////        } catch (IllegalArgumentException e) {
////            view.showError(e.getMessage());
////        }
////    }
////    public void evaluateExpression() {
////        String expression = view.getInput();
////        String postfix = infixToPostfix(expression);
////
////        if (postfix == null) {
////            System.out.println("Error: Invalid expression");
////            return;
////        }
////
////        int result = evaluate(postfix);
////        view.showResult(result);
////    }
//    public void evaluateExpression() {
//        String expression = view.getInput();
//        if (expression != null) {
//            String postfix = infixToPostfix(expression);
//            int result = evaluate(postfix);
//            view.setOutput(result);
//        } else {
//            view.showError("Please enter an expression to evaluate.");
//        }
//    }
//
//
//    private int evaluate(String expression) {
//        // Convert infix expression to postfix notation
//        String postfix = infixToPostfix(expression);
//        
//        // Evaluate postfix expression using a stack
//        Stack<Integer> stack = new Stack<>();
//        for (char c : postfix.toCharArray()) {
//            if (Character.isDigit(c)) {
//                stack.push(c - '0');
//            } else {
//                int b = stack.pop();
//                int a = stack.pop();
//                switch (c) {
//                    case '+': stack.push(a + b); break;
//                    case '-': stack.push(a - b); break;
//                    case '*': stack.push(a * b); break;
//                    case '/': stack.push(a / b); break;
//                    default: throw new IllegalArgumentException("Invalid operator: " + c);
//                }
//            }
//        }
//        if (stack.size() != 1) {
//            throw new IllegalArgumentException("Invalid expression: " + expression);
//        }
//        return stack.pop();
//    }
//
////    private String infixToPostfix(String expression) {
//    	public String infixToPostfix(String expression) {
//    	    String postfix = "";
//    	    Stack<Character> stack = new Stack<>();
//
//    	    for (int i = 0; i < expression.length(); i++) {
//    	        char c = expression.charAt(i);
//
//    	        if (Character.isDigit(c)) {
//    	            postfix += c;
//    	        } else if (c == '(') {
//    	            stack.push(c);
//    	        } else if (c == ')') {
//    	            while (!stack.isEmpty() && stack.peek() != '(') {
//    	                postfix += stack.pop();
//    	            }
//    	            if (!stack.isEmpty() && stack.peek() != '(') {
//    	                return null; // error: unmatched parenthesis
//    	            } else {
//    	                stack.pop();
//    	            }
//    	        } else {
//    	            while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
//    	                postfix += stack.pop();
//    	            }
//    	            stack.push(c);
//    	        }
//    	    }
//
//    	    while (!stack.isEmpty()) {
//    	        if (stack.peek() == '(') {
//    	            return null; // error: unmatched parenthesis
//    	        }
//    	        postfix += stack.pop();
//    	    }
//
//    	    return postfix;
////    	}
//    }
//
//private int precedence(Character peek) {
//	// TODO Auto-generated method stub
//	return 0;
//}
//}
//
    public void evaluateExpression1() {
        String expression = view.getInput();
        if (expression == null || expression.isEmpty()) {
            view.showErrorMessage("Please enter an arithmetic expression.");
            return;
        }

        // Convert infix expression to postfix
        StringBuilder postfixBuilder = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                postfixBuilder.append(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operatorStack.isEmpty() && getPrecedence(ch) <= getPrecedence(operatorStack.peek())) {
                    postfixBuilder.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixBuilder.append(operatorStack.pop());
                }
                operatorStack.pop();
            }
        }
        while (!operatorStack.isEmpty()) {
            postfixBuilder.append(operatorStack.pop());
        }
        String postfix = postfixBuilder.toString();

        // Evaluate postfix expression
        Stack<Integer> operandStack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                operandStack.push(Character.getNumericValue(ch));
            } else {
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int result = evaluateOperation(operand1, operand2, ch);
                operandStack.push(result);
            }}
        }
        private int evaluateOperation(int operand1, int operand2, char ch) {
		// TODO Auto-generated method stub
		return 0;
	}

		public void evaluateExpression() {
            String expression = view.getInput();
            if (expression == null || expression.isEmpty()) {
                view.showErrorMessage("Please enter a valid expression.");
                return;
            }
            try {
                String postfix = infixToPostfix(expression);
                int result = evaluate(postfix);
                view.showExpressionResult(result);
            } catch (Exception e) {
                view.showErrorMessage("An error occurred while evaluating the expression.");
            }
        }

        private int evaluate(String postfix) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < postfix.length(); i++) {
                char c = postfix.charAt(i);
                if (Character.isDigit(c)) {
                    stack.push(Character.getNumericValue(c));
                } else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    switch (c) {
                        case '+':
                            stack.push(operand1 + operand2);
                            break;
                        case '-':
                            stack.push(operand1 - operand2);
                            break;
                        case '*':
                            stack.push(operand1 * operand2);
                            break;
                        case '/':
                            stack.push(operand1 / operand2);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        private int getPrecedence(char c) {
            switch (c) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
            }
            return -1;
        }

        private String infixToPostfix(String expression) {
            Stack<Character> stack = new Stack<>();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);
                if (Character.isDigit(c)) {
                    result.append(c);
                } else if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result.append(stack.pop());
                    }
                    stack.pop(); // Pop the '('
                } else {
                    while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                        result.append(stack.pop());
                    }
                    stack.push(c);
                }
            }
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }
            return result.toString();
        }
    }
