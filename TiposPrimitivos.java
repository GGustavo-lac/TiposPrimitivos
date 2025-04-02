/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos;
/** Primeiro projeto java no laboratorio 111
 */
/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
 public static void main (String [] args) {
     // Declaração de variáveis primitivas
     byte idade = 22; // Suporta números pequenos (-128 a 127)
     short ano = 2025; // Suporta valores um pouco maiores (-32.76)
     int populacaopaulista = 12000000; // Tipo mais comum para números
     long populacaoGlobal = 8000000000L; // Necessário 'L' para valores longos
     
     float altura = 1.80f; //Necessário 'f' no final para indicar float
     double peso = 80.0; // Mais preciso que float
     
     char letrainicial = 'g'; // Armazena um único caractere
     boolean ativo = true; // Armazena verdadeiro ou falso
     
     //Exibição dos valores
     System.out.println ("Idade: " + idade);
     System.out.println("Ano:"+ ano);
     System.out.println("População de São paulo:" + populacaopaulista);
     System.out.println ("População Global:"+ populacaoGlobal);
     System.out.println ("Altura:"+ altura + "metros");
     System.out.println ("Peso:"+ peso + "kilogramas");
     System.out.println ("Letra inicial:" + letrainicial);
     System.out.println("Está ativo?" + ativo);
     
     
 }
}
 
 
