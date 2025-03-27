/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos;
/** Primeiro projeto java no laboratório 111
 */
/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
 public static void main (String [] args) {
     // Declaração de variáveis primitivas
     byte idade = 25; // Suporta números pequenos (-128 a 127)
     short ano = 2025; // Suporta valores um pouco maiores (-32.76)
     int populacaoCidade = 500000; // Tipo mais comum para números
     long populacaoMundial = 8000000000L; // Necessário 'L' para valores longos
     
     float altura = 1.75f; //Necessário 'f' no final para indicar float
     double peso = 72.5; // Mais preciso que float
     
     char inicial = 'J'; // Armazena um único caractere
     boolean ativo = true; // Armazena verdadeiro ou falso
     
     //Exibição dos valores
     System.out.println ("Idade: " + idade);
     System.out.println("Ano:"+ ano);
     System.out.println("População da cidade:" + populacaoCidade);
     System.out.println ("População mundial:"+ populacaoMundial);
     System.out.println ("Altura:"+ altura + "m");
     System.out.println ("Peso:"+ peso + "kg");
     System.out.println ("Inicial do nome:" + inicial);
     System.out.println("Está ativo?" + ativo);
     
     
 }
}
 