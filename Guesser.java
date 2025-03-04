package colllections.M1S2;

import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Adivinhe e insira o número de 1 a 5 que eu estou pensando:" );
        String strNumberGuessed = (input.nextLine());
        strNumberGuessed = strNumberGuessed.replace(",", ".");
        int numberGuessed = Integer.parseInt(strNumberGuessed);

        int rand = (int) (Math.random() * (5-1) + 1);

        if (numberGuessed == rand) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou, o número correto era: " + rand);
        }
    }
}
