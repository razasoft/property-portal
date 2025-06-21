# Mini Calculator

This project is a simple console-based mini calculator that performs basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Project Structure

```
mini-calculator
├── src
│   ├── Calculator.java
│   ├── Main.java
│   └── utils
│       └── InputHelper.java
└── README.md
```

## Files Description

- **Calculator.java**: Contains the `Calculator` class with methods for basic arithmetic operations:
  - `add(int a, int b)`
  - `subtract(int a, int b)`
  - `multiply(int a, int b)`
  - `divide(int a, int b)`

- **Main.java**: The entry point of the application. It creates an instance of `Calculator` and interacts with the user to perform calculations.

- **InputHelper.java**: Provides utility methods for reading user input from the console:
  - `readInt()`
  - `readDouble()`

## How to Compile and Run

1. Navigate to the project directory:
   ```
   cd mini-calculator
   ```

2. Compile the Java files:
   ```
   javac src/*.java src/utils/*.java
   ```

3. Run the application:
   ```
   java src/Main
   ```

## Usage

Follow the prompts in the console to perform calculations. You can enter two numbers and select the desired operation to see the result.