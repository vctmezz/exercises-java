package math;
import java.util.Scanner;

public class mediaSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua primeira nota:");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota");
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("Sua media e " + media);
        entrada.close();

    }

}
