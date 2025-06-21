public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHelper inputHelper = new InputHelper();

        System.out.println("Welcome to the Mini Calculator!");
        System.out.println("Select an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = inputHelper.readInt("Enter your choice (1-4): ");

        double num1 = inputHelper.readDouble("Enter first number: ");
        double num2 = inputHelper.readDouble("Enter second number: ");
        double result = 0;

        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
    }
}