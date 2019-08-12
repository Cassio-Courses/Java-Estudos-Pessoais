package numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n,s=0;
        String resp;
        Scanner tec = new Scanner(System.in);
        do{
            System.out.println("Digite um numero");
            n = tec.nextInt();
            s += n;
            System.out.println("Deseja continuar?[S/N]");
            resp = tec.next().toUpperCase();
        }while(resp.equals("S".toUpperCase()));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
