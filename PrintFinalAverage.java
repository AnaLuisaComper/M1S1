package colllections.M1S2;

import java.util.Scanner;

public class PrintFinalAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota do semestre: ");
        String strScore1 = (input.nextLine());
        strScore1 = strScore1.replace(",", ".");
        double score1 = Double.parseDouble(strScore1);

        System.out.println("Informe a segunda nota do semestre: ");
        String strScore2 = (input.nextLine());
        strScore2 = strScore2.replace(",", ".");
        double score2 = Double.parseDouble(strScore2);

        System.out.println("Informe a terceira nota do semestre: ");
        String strScore3 = (input.nextLine());
        strScore3 = strScore3.replace(",", ".");
        double score3 = Double.parseDouble(strScore3);

        double finalAverage =  (score1 + score2 + score3)/ 3;

        System.out.println("Sua média final é : " + finalAverage);
    }
}
