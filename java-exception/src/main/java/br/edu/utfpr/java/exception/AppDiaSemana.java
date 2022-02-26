/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.java.exception;

import javax.swing.JOptionPane;


public class AppDiaSemana {
    public static void main(String[] args) {
        int dia = 8;
        try {
             System.out.println(ConversorDiaSemana.convert(dia));
        } catch (DiaSemanaException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
       
    }
    
}
