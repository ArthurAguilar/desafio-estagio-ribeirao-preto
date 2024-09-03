// 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String stringInput = sc.nextLine();

        int quantidade = contarOcorrenciasDeA(stringInput);

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        sc.close();
    }

    public static int contarOcorrenciasDeA(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
