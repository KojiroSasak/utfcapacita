
package br.edu.utfpr.java.exception;

import javax.swing.JOptionPane;


public class exemplo1 {
    public static void main(String[] args) {
        int numero = -1;
        String  res =  JOptionPane.showInputDialog("Informe um numero");
        
        try {
             numero = Integer.valueOf(res);
             JOptionPane.showMessageDialog(null,"numero digitado foi " + numero );
        if(numero == 10){
           float a = numero / 0;
        }
        } catch (NumberFormatException e) {
            System.out.println("Formato Incorreto "+ e.getMessage());
            JOptionPane.showMessageDialog(null,"Formato Invalido" );
            //e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Operação invalida " +e.getMessage() );
            
        }
        finally{
            System.out.println("Finalizou a execução do algoritmo");  
        }
            

        
    }
    
}
