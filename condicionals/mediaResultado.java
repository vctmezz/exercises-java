import java.util.Scanner;

public class mediaResultado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Erro: notas inválidas");
        } else {

            double media = (nota1 + nota2) / 2;

            if (media >= 7) {
                System.out.println("Media: " + media + " - Aprovado");
            } else if (media >= 5) {
                System.out.println("Media: " + media + " - Recuperacao");
            } else {
                System.out.println("Media: " + media + " - Reprovado");
            }
        }

        entrada.close();
    }
}