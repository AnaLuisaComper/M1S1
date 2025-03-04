package colllections.M1S2;

import java.util.Scanner;

public class PrintUserName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu sobrenome: ");
        String lastname = input.nextLine();

        System.out.println("Digite o seu nome: ");
        String name = input.nextLine();
        System.out.println("Seu nome completo é : " + name + " " + lastname);
        System.out.println("Seu nome completo contém " + (name.length() + lastname.length()) + " letras.");
    }
}
