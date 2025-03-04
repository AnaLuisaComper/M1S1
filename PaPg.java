package colllections.M1S2;

import java.util.Scanner;

public class PaPg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor inicial: ");
        String strValue = (input.nextLine());
        strValue = strValue.replace(",", ".");
        int value = Integer.parseInt(strValue);

        System.out.println("Informe o valor da raiz; ");
        String strSource = (input.nextLine());
        strSource = strSource.replace(",", ".");
        int source = Integer.parseInt(strSource);

        System.out.println("Você deseja calcular os dez primeiros valores de uma PA ou de uma PG?");
        String operation = (input.nextLine());

        double result = 0;

        if ( operation.equalsIgnoreCase("PA")) {
            for (int i = 0; i <=9; i++) {
                result = value + (source * i);
                System.out.println("Os resultados da PA são: " + result);
            }} else if (operation.equalsIgnoreCase("PG")) {
                for (int i = 0; i < 10; i++) {
                    result = value * Math.pow(source, i) ;

                    System.out.println("Os resultados de PG são: " + result);
                }
        }
    }
}
