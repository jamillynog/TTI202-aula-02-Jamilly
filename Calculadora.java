import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Selecione a operacao ( + , -, *, / ): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println(num1 +" "+ operator +" "+ num2 + " = " + result);
    }
}