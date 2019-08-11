package condições;

import java.util.Scanner;
import java.time.Year;

public class Condições {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //primeira();
        segunda();
    }

    public static void primeira() {
        System.out.println("Insira a nota 1");
        float n1 = entrada.nextFloat();
        System.out.println("Insira a nota 2");
        float n2 = entrada.nextFloat();
        float media = (n1 + n2) / 2f;
        System.out.println(media);
        if (media >= 9) {
            System.out.println("Parabéns");
        }
    }

    public static void segunda() {
        System.out.println("Insira a dada de nascimento");
        int dataNascimento = entrada.nextInt();
        int anoAtual = Integer.parseInt(Year.now().toString());
        int idade = anoAtual - dataNascimento;
        System.out.println("Sua idade é " + idade);
        if (idade >= 18){
            System.out.println("Maior");
        }
        else{
            System.out.println("Menor");
        }
    }
}
