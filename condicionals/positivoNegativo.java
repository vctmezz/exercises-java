import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
     
        System.out.println("Digite um numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println("Positivo");
        }
        if (numero < 0) {
            System.out.println("Negativo");
        }
        if (numero == 0) {
            System.out.println("Zero");
        }
        entrada.close();
    }
}
