/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;


/**
 *
 * @author Luciano Martinez
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
       
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        int n, s =0;
        int totalValores = 0;
        int pares = 0, impares = 0, acimaCem = 0, mediaValores =0;
        
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um numero: <br><em>(o valor ZERO interrompe)</em></html>"));
        s += n;  
        totalValores++;
        
            if (n%2 != 0){
                impares++;
            }else{
                pares++;
            }
            if (n > 100){
                acimaCem++;
            }
        
        } while(n != 0);
        mediaValores = (s)/(totalValores - 1);
        JOptionPane.showMessageDialog(null, "<html>-----------------------" 
                + "<br>Total de Valores = " + (totalValores - 1) +
                "<br> Total de Pares = " + (pares - 1) +
                "<br> Total de Ímpares = " + impares +
                "<br> Acima de 100 = " + acimaCem +
                "<br> Média de Valores = " + mediaValores +
                "</html>", "Resultado Final", 1);
    }
    
}
