package colllections.M1S2;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        String strNumber1 = (input.nextLine());
        strNumber1 = strNumber1.replace(",", ".");
        double number1 = Double.parseDouble(strNumber1);

        System.out.println("Informe mais um número: ");
        String strNumber2 = (input.nextLine());
        strNumber2 = strNumber2.replace(",", ".");
        double number2 = Double.parseDouble(strNumber2);

        System.out.println("Informe a operação: soma, subtração, multiplicação e divisão");
        String strOperation = (input.nextLine());

        double result = 0;

        if (strOperation.equalsIgnoreCase("soma")) {
            result = number1 + number2;
        } else if (strOperation.equalsIgnoreCase("subtração")) {
            result = number1 - number2;
        } else if (strOperation.equalsIgnoreCase("multiplicação")) {
            result = number1 * number2;
        } else if (strOperation.equalsIgnoreCase("divisão")) {
            result = number1 / number2;
            if (number2 == 0) {
                System.out.println("Erro: divisão por zero!");
                return;
            }
        }

        System.out.println("O resultado da conta é " + result);

    }}
