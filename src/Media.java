/*CRIAR QUATRO NOTAS DO TIPO DOUBLE
 * E FAZER A MEDIA DESSAS QUATRO NOTAS
 * NO FINAL IMPRIMIR NA TELA A MEDIA
 * PRIMEIRO*/


import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual foi sua nota 1?");
        double nota1 = input.nextDouble();

        System.out.println("Qual foi a sua nota 2");
        double nota2 = input.nextDouble();

        System.out.println("Qual foi a sua nota 3");
        double nota3 = input.nextDouble();

        System.out.println("Qual foi a sua nota 4");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A sua média é de: "+ media);




    }
}

