import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero1 = entrada.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = entrada.nextInt();
        System.out.println("Digite outro numero");
        int numero3 = entrada.nextInt();
        String mensagem;
        
        if (numero1 == numero2 && numero2 == numero3) {
            mensagem = "Numeros iguais";   
        } 

        if (numero1 > numero2 && numero1 > numero3) {
            mensagem = "O numero maior eh " + numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            mensagem = "O numero maior eh " + numero2;
        } else {
            mensagem = "O numero maior eh " + numero3;

        }

        System.out.println(mensagem);

        entrada.close();

    }
}
