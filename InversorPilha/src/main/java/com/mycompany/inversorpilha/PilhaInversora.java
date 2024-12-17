/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inversorpilha;

/**
 *
 * @author Estudos
 */
import java.util.Stack;

class PilhaInversora {
    public static String inverterPalavra(String palavra) {
        Stack<Character> pilha = new Stack<>();
        
        for (char letra : palavra.toCharArray()) {
            pilha.push(letra);
        }
        
        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }
        
        return palavraInvertida.toString();
    }

    public static String inverterLetrasPorPalavra(String frase) {
        String[] palavras = frase.split(" "); 
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < palavras.length; i++) {
            resultado.append(inverterPalavra(palavras[i]));
            
            if (i < palavras.length - 1) {
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }
}
