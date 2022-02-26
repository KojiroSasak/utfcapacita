package br.edu.utfpr.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Exemplo de uso de datas com a API antiga.
 */
public class exemplo1 {
    public static void main(String[] args) {
        Date  hoje = new Date();
        System.out.println(hoje);
        
        Calendar c = Calendar.getInstance();
        System.out.println("Data/hora atual"+ c.getTime());
        System.out.println("Ano" + c.get(Calendar.YEAR));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MONTH/yyyy");
        System.out.p;
        
    }
}
