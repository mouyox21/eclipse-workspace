package calculatrice;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

interface Filter {
    void apply(Stack<Double> stack, String input);
}

class InputFilter implements Filter {
    @Override
    public void apply(Stack<Double> stack, String input) {
        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            if (!token.equals("")) {
                stack.push(Double.parseDouble(token));
            }
        }
    }
}

class AdditionFilter implements Filter {
    @Override
    public void apply(Stack<Double> stack, String input) {
        stack.push(stack.pop() + stack.pop());
    }
}

class SubtractionFilter implements Filter {
    @Override
    public void apply(Stack<Double> stack, String input) {
        double a = stack.pop();
        double b = stack.pop();
        stack.push(b - a);
    }
}

class MultiplicationFilter implements Filter {
    @Override
    public void apply(Stack<Double> stack, String input) {
        stack.push(stack.pop() * stack.pop());
    }
}

class DivisionFilter implements Filter {
    @Override
    public void apply(Stack<Double> stack, String input) {
        double a = stack.pop();
        double b = stack.pop();
        stack.push(b / a);
    }
}

class Calculator {
    private final Stack<Double> stack;
    private final Filter[] filters;

    public Calculator(Filter[] filters) {
        this.filters = filters;
        this.stack = new Stack<>();
    }

    public void calculate(String input) {
        for (Filter filter : filters) {
            filter.apply(stack, input);
        }
    }

    public Double getResult() {
        return stack.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        Filter[] filters = new Filter[]{
                new InputFilter(),
                new AdditionFilter(),
                new SubtractionFilter(),
                new MultiplicationFilter(),
                new DivisionFilter()
        };
        Calculator calculator = new Calculator(filters);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une expression mathématique : ");
        String input = scanner.nextLine();
        calculator.calculate(input);
        System.out.println("Résultat : " + calculator.getResult());
    }
}
