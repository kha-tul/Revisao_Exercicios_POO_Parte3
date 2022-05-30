package revisao.exercicios;
/*
Crie um programa que leia um valor inteiro (este número tem que conter 4 dígitos).
 A saída é mostrar a quantidade de dígitos “pares”. Exemplo.: Digamos que a entrada foi 3257.
 A resposta será 1 Regras: a) A entrada deve estar entre 1000 e 9999 b)
 Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos e
 continuar a programação até a resposta final. Multiplicando (Intervalo/Resto)

 */

import java.util.Scanner;

public class Ex1_QuantidadeParesNumeroInteiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Informe um valor inteiro e positivo (este número deverá conter 4 dígitos): ");
            int numeroInformado = scan.nextInt();
            String numeroInformadoString = String.valueOf(numeroInformado);
            if(numeroInformado >= 1000 && numeroInformado <= 9999) {
                StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
                System.out.println(stringBuilder.reverse());
                break;
            } else if(numeroInformadoString.length() < 4) {
                System.out.println("O número informado deverá conter 4 dígitos!");
            }
        } while(true);
    }
}
