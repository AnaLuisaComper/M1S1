package colllections.M1S2;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua altura: (Informe duas casas decimais.)");
        String  strHeight = (input.nextLine());
        strHeight = strHeight.replace(",", ".");
        double altura = Double.parseDouble(strHeight);

        System.out.println("Digite o seu peso: ");
        double peso = Double.parseDouble(input.nextLine());

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }
}
