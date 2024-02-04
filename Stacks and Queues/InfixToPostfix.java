import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infixExpression =sc.nextLine() ;
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println(postfixExpression);
    }

    private static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<String> operators = new Stack<>();

        String[] tokens = infixExpression.split(" ");

        for (String token : tokens) {
            if (isOperand(token)) {
                postfix.append(token).append(" ");
            } else if (isOperator(token)) {
                while (!operators.isEmpty() && hasHigherPrecedence(operators.peek(), token)) {
                    postfix.append(operators.pop()).append(" ");
                }
                operators.push(token);
            } else if (token.equals("(")) {
                operators.push(token);
            } else if (token.equals(")")) {
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    postfix.append(operators.pop()).append(" ");
                }
                operators.pop(); // Pop the '('
            }
        }

        while (!operators.isEmpty()) {
            postfix.append(operators.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    private static boolean isOperand(String token) {
        return token.matches("\\d+|[a-z]");
    }

    private static boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }

    private static int getPrecedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return 0;
    }

    private static boolean hasHigherPrecedence(String operator1, String operator2) {
        return getPrecedence(operator1) >= getPrecedence(operator2);
    }
}
