import java.util.Scanner;

public class validacaoClassificacao {

    public static void main(String[] args ) { 
        Scanner entrada = new Scanner(System.in);
        
         System.out.println("Qual a sua nota?");
            double nota = entrada.nextDouble();
          
            if (nota < 0 || nota > 10) { 
            } else {
            if (nota >= 9) {
                System.out.println("Excelente!");
            } else if  (nota >=7) {
                System.out.println("Aprovado");
            } else if  (nota >=5) {
                System.out.println("Recuperacao");
            } else if (nota <5) {
                System.out.println("Reprovado");
            }
            
            entrada.close();
            
            }
        }               
    }                
            
             
          


        
  
