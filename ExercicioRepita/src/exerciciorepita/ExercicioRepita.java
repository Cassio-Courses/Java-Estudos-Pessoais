package exerciciorepita;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ExercicioRepita {
    public static void main(String[] args) {
        int n, s = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um numero"));
        s  += n;
        
        
        }while(n != 0);
        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + s,"Soma Total" ,1);
        https://youtu.be/sUSnoHiTZ8E?list=1&t=775 continuação exercicio
        
    }
    
}
