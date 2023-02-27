package com.view;
//import java.util.Scanner;
//
//public class CalculatorView {
//
//    Scanner scanner;
//
//    public CalculatorView() {
//        scanner = new Scanner(System.in);
//    }
//
//    public int getFirstNumber() {
//        System.out.print("Enter first number: ");
//        return scanner.nextInt();
//    }
//
//    public int getSecondNumber() {
//        System.out.print("Enter second number: ");
//        return scanner.nextInt();
//    }
//
//    public void showAdditionResult(int result) {
//        System.out.println("Addition result: " + result);
//    }
//
//    public void showSubtractionResult(int result) {
//        System.out.println("Subtraction result: " + result);
//    }
//
//    public void showMultiplicationResult(int result) {
//        System.out.println("Multiplication result: " + result);
//    }
//
//    public void showDivisionResult(int result) {
//        System.out.println("Division result: " + result);
//    }
//
//}

import java.util.Scanner;

public class CalculatorView {

    Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public int getFirstNumber() {
        System.out.print("Enter first number: ");
        return scanner.nextInt();
    }

    public int getSecondNumber() {
        System.out.print("Enter second number: ");
        return scanner.nextInt();
    }
    public double getAngle() {
        System.out.print("Enter angle in degrees: ");
        return scanner.nextDouble();
    }


    public void showAdditionResult(int result) {
        System.out.println("Addition result: " + result);
    }

    public void showSubtractionResult(int result) {
        System.out.println("Subtraction result: " + result);
    }

    public void showMultiplicationResult(int result) {
        System.out.println("Multiplication result: " + result);
    }

    public void showDivisionResult(int result) {
        System.out.println("Division result: " + result);
    }

    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public void showSinResult(double result) {
        System.out.println("Sin result: " + result);
    }

    public void showCosResult(double result) {
        System.out.println("Cos result: " + result);
    }

    public void showTanResult(double result) {
        System.out.println("Tan result: " + result);
    }

    public void showSquareRootResult(double result) {
        System.out.println("Square root result: " + result);
    }

    public String getExpression() {
        System.out.print("Enter an expression: ");
        return scanner.next();
    }

    public void showExpressionResult(double result) {
        System.out.println("Expression result: " + result);
    }

	public String getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	public void showErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}

//	public void showErrorMessage(String string) {
//		// TODO Auto-generated method stub
//		
//	}

		
}
