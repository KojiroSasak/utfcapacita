
package br.edu.utfpr.java.exception;

public class ConversorDiaSemana {
    public static String convert(int dia) throws DiaSemanaException{
        switch (dia){
            case 1: return "Domingo";
            case 2: return "Segunda";
            case 3: return "Terça";
            case 4: return "Quarta";
            case 5: return "Quinta";
            case 6: return "Sexta";
            case 7: return "Sabado";
            default:
                throw new DiaSemanaException("dia não existente");
        }
    }
    
}
