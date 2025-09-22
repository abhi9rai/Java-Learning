package oop;
import java.util.Scanner;

// Custom Exceptions
        class InvalidInputException extends Exception {
            public InvalidInputException(String message) {
                super(message);
            }
        }

        class CannotDivideByZeroException extends Exception {
            public CannotDivideByZeroException(String message) {
                super(message);
            }
        }

        class MaxInputException extends Exception {
            public MaxInputException(String message) {
                super(message);
            }
        }

        class MaxMultiplierReachedException extends Exception {
            public MaxMultiplierReachedException(String message) {
                super(message);
            }
        }

// Calculator Class
        class CustomCalculator {

            // Check constraints
            private void validateInputs(double a, double b) throws InvalidInputException, MaxInputException {
                if (a == 8 && b == 9) {
                    throw new InvalidInputException("Invalid input: 8 and 9 are not allowed!");
                }
                if (a > 100000 || b > 100000) {
                    throw new MaxInputException("Input greater than 100000 is not allowed!");
                }
            }

            public double add(double a, double b) throws InvalidInputException, MaxInputException {
                validateInputs(a, b);
                return a + b;
            }

            public double subtract(double a, double b) throws InvalidInputException, MaxInputException {
                validateInputs(a, b);
                return a - b;
            }

            public double multiply(double a, double b) throws InvalidInputException, MaxInputException, MaxMultiplierReachedException {
                validateInputs(a, b);
                if (a > 7000 || b > 7000) {
                    throw new MaxMultiplierReachedException("Multiplication input cannot be greater than 7000!");
                }
                return a * b;
            }

            public double divide(double a, double b) throws InvalidInputException, MaxInputException, CannotDivideByZeroException {
                validateInputs(a, b);
                if (b == 0) {
                    throw new CannotDivideByZeroException("Cannot divide by 0!");
                }
                return a / b;
            }
        }

// Main Class
        public class EX6_SOL_103 {
            public static void main(String[] args) {
                CustomCalculator calc = new CustomCalculator();
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter first number: ");
                double a = sc.nextDouble();
                System.out.println("Enter second number: ");
                double b = sc.nextDouble();

                System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
                int choice = sc.nextInt();

                try {
                    double result = 0;
                    switch (choice) {
                        case 1:
                            result = calc.add(a, b);
                            break;
                        case 2:
                            result = calc.subtract(a, b);
                            break;
                        case 3:
                            result = calc.multiply(a, b);
                            break;
                        case 4:
                            result = calc.divide(a, b);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            return;
                    }
                    System.out.println("Result = " + result);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

                sc.close();
            }
        }
