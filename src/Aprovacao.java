import java.util.Scanner;

public class Aprovacao {

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

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        }
        else if ((media <= 7.0) && ( media >= 6.0))
        {
             System.out.println("Você está em recuperação!");
        } else {
             System.out.println("Não Aprovado!");

        }


    }
}
