import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
                 int idade = entrada.nextInt();

       
        if (idade < 18) {
            System.out.println("Voce eh menor de idade");
        } else if (idade >= 18 && idade <= 59) {
                System.out.println("Voce eh adulto");
            } else { 
                System.out.println("Idoso");
            }
        
            entrada.close();
            
        }
    }
            