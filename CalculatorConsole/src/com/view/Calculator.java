package com.view;

import com.controller.CalculatorController;
import com.model.CalculatorModel;

//public class Calculator {
//
//    public static void main(String[] args) {
//        CalculatorModel model = new CalculatorModel();
//        CalculatorView view = new CalculatorView();
//        CalculatorController controller = new CalculatorController(model, view);
//
//        int choice;
//
//        do {
//            System.out.println("Calculator Application");
//            System.out.println("1. Addition");
//            System.out.println("2. Subtraction");
//            System.out.println("3. Multiplication");
//            System.out.println("4. Division");
//            System.out.println("0. Exit");
//            System.out.print("Enter your choice: ");
//            choice = view.scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    controller.calculateAddition();
//                    break;
//                case 2:
//                    controller.calculateSubtraction();
//                    break;
//                case 3:
//                    controller.calculateMultiplication();
//                    break;
//                case 4:
//                    controller.calculateDivision();
//                    break;
//                case 0:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//
//            System.out.println();
//
//        } while (choice != 0);
//    }
//}

public class Calculator {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        int choice;

        do {
            System.out.println("Calculator Application");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sin");
            System.out.println("6. Cos");
            System.out.println("7. Tan");
            System.out.println("8. Square root");
            System.out.println("9. Evaluate expression");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = view.scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.calculateAddition();
                    break;
                case 2:
                    controller.calculateSubtraction();
                    break;
                case 3:
                    controller.calculateMultiplication();
                    break;
                case 4:
                    controller.calculateDivision();
                    break;
                case 5:
                    controller.calculateSin();
                    break;
                case 6:
                    controller.calculateCos();
                    break;
                case 7:
                    controller.calculateTan();
                    break;
                case 8:
                    controller.calculateSqrt();
                    break;
                case 9:
                    controller.evaluateExpression();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();

        } while (choice != 0);
    }
}
