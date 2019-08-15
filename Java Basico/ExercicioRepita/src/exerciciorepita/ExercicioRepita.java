package exerciciorepita;
import javax.swing.JOptionPane;
public class ExercicioRepita {
    public static void main(String[] args) {
        int n, s = 0, totVal = 0, totPar = 0, totImpar = 0, acimaCem = 0;
        float mediaVal = 0;
        
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um numero"));
        if (n != 0){
        s  += n;
        totVal++;
        //TotparImpar
        if (n % 2 == 0){
            totPar++;
        }
        else{
            totImpar++;
        }
        if (n > 100){
            acimaCem++;
        }
        mediaVal +=  (float) n;
        }
        }while(n != 0);
        mediaVal /= (float) totVal;
        JOptionPane.showMessageDialog(null, "<html>A soma dos valores é: " + s + 
                "<hr>" +
                " <br> Total de Valores: " + totVal + 
                " <br> Total de Pares: " + totPar +
                " <br> Total de Ímpares: " +  totImpar + 
                " <br> Acima de 100: " + acimaCem +
                " <br> Média de Valores: " + mediaVal + "</html>" ,"Soma Total" ,1);
                System.out.println(mediaVal);
                
    }
    
}
