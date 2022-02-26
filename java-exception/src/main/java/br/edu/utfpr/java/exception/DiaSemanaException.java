
package br.edu.utfpr.java.exception;


public class DiaSemanaException extends Exception {
       

    public DiaSemanaException() {
        super("Dia da semana inválido");
        
    }

    public DiaSemanaException(String message) {
        super(message);
    }
       
    
}
