import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua nota?");
        double nota = entrada.nextDouble();

        if (nota >= 9) {
            System.out.println("Nota: " + nota + " Excelente!");
        } else if (nota >= 7) {
            System.out.println("Nota: " + nota + " Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Nota " + nota + " Recuperacao");
        } else {
            System.out.println("Nota: " + nota + " Reprovado");
        }

        entrada.close();

    }
}
