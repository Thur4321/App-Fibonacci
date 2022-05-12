
package fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {

    public static void main(String[] args) {
       
       int número=Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos termos você quer na sua sequência?","Fibonacci",3));
       
       NúmeroFibonacci objFibonacci = new NúmeroFibonacci();
       
       objFibonacci.setNúmero(número);
       
       JOptionPane.showMessageDialog(null, "Sua sequência é: "+objFibonacci.fibonacci(),"Fibonacci",1);
    }
    
}
