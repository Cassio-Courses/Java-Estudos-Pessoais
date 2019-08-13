package vetores2;

import java.util.Arrays;

public class Vetores2 {
  
    public static void main(String[] args) {
        int num[] = {3, 5, 1, 8, 4};
        Arrays.sort(num); //Sortea arrays
        int pos =   Arrays.binarySearch(num,8);
        for (int valor: num){
            System.out.println(valor);
        }
        System.out.println("Encontrei o valor na 1 na posição " + pos);
    }
    
}
