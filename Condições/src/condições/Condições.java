package condições;

import java.util.Scanner;

public class Condições {
    public static Scanner entrada = new Scanner(System.in); 
    public static void main(String[] args) {
        
        System.out.println("Insira a nota 1");
        float n1 = entrada.nextFloat();
        System.out.println("Insira a nota 2");
        float n2 = entrada.nextFloat();
        float media = (n1 + n2) / 2f;
        System.out.println(media);
        if(media >= 9){
            System.out.println("Parabéns");
        }
        
    }
    
}
