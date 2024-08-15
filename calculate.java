import java.util.*;

public class calculate {

    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        System.out.println("Please enter equation: ");
        String equation = scanny.nextLine();
        readEquation(equation);
        scanny.close();
    }

    public static void readEquation(String e) {
        ArrayList<Integer> inputs = new ArrayList<>();
        int startIndex = 0;
        int currentIndex;

        // Handle addition
        if (e.contains("+")) {
            while((currentIndex = e.indexOf("+", startIndex)) != -1) {
                inputs.add(Integer.parseInt(e.substring(startIndex, currentIndex).trim()));
                startIndex = currentIndex + 1;
            }
            inputs.add(Integer.parseInt(e.substring(startIndex).trim()));  // Add last number
            add(inputs);
        }
        // Handle subtraction
        else if (e.contains("-")) {
            while((currentIndex = e.indexOf("-", startIndex)) != -1) {
                inputs.add(Integer.parseInt(e.substring(startIndex, currentIndex).trim()));
                startIndex = currentIndex + 1;
            }
            inputs.add(Integer.parseInt(e.substring(startIndex).trim()));  // Add last number
            subtract(inputs);
        }
        // Handle division
        else if (e.contains("/")) {
            while((currentIndex = e.indexOf("/", startIndex)) != -1) {
                inputs.add(Integer.parseInt(e.substring(startIndex, currentIndex).trim()));
                startIndex = currentIndex + 1;
            }
            inputs.add(Integer.parseInt(e.substring(startIndex).trim()));  // Add last number
            divide(inputs);
        }
        // Handle multiplication
        else if (e.contains("*")) {
            while((currentIndex = e.indexOf("*", startIndex)) != -1) {
                inputs.add(Integer.parseInt(e.substring(startIndex, currentIndex).trim()));
                startIndex = currentIndex + 1;
            }
            inputs.add(Integer.parseInt(e.substring(startIndex).trim()));  // Add last number
            multiply(inputs);
        }
        // Handle invalid expressions
        else {
            System.out.println("Invalid expression");
        }
    }

    public static void add(ArrayList<Integer> inputs) {
        int output = 0;
        for (int input : inputs) {
            output += input;
        }
        System.out.println("The answer to your equation is: " + output);
    }

    public static void subtract(ArrayList<Integer> inputs) {
        int output = inputs.get(0);
        for (int i = 1; i < inputs.size(); i++) {
            output -= inputs.get(i);
        }
        System.out.println("The answer to your equation is: " + output);
    }

    public static void divide(ArrayList<Integer> inputs) {
        int output = inputs.get(0);
        for (int i = 1; i < inputs.size(); i++) {
            output /= inputs.get(i);
        }
        System.out.println("The answer to your equation is: " + output);
    }

    public static void multiply(ArrayList<Integer> inputs) {
        int output = 1;  // Initialize to 1 for multiplication
        for (int input : inputs) {
            output *= input;
        }
        System.out.println("The answer to your equation is: " + output);
    }
}