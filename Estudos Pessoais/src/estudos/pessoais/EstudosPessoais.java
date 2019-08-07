package estudos.pessoais;

import java.util.Scanner;

public class EstudosPessoais {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, result;
        System.out.println("Digite um numero");
        num1 = entrada.nextFloat();
        System.out.println("Digite outro numero");
        num2 = entrada.nextFloat();
       
    }

}

class procedimentos {

}

class Funcoes {

    public static float soma(float num1, float num2) {
        float resultado;
        resultado = num1 + num2;
        return resultado;
    }

    public static float subs(float num1, float num2) {
        float resultado;
        resultado = num1 - num2;
        return resultado;
    }

    public static float multi(float num1, float num2) {
        float resultado;
        resultado = num1 * num2;
        return resultado;
    }

    public static float divs(float num1, float num2) {
        float resultado;
        resultado = num1 / num2;
        return resultado;
    }
}
