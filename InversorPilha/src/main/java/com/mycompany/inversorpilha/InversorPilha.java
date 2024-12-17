/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inversorpilha;

/**
 *
 * @author Estudos
 */
public class InversorPilha {
    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO E UM TECNOLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        System.out.println("Exemplo 1: " + PilhaInversora.inverterLetrasPorPalavra(exemplo1));
        
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC E O OGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SO SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED .SAIOG";
        System.out.println("Exemplo 2: " + PilhaInversora.inverterLetrasPorPalavra(exemplo2));
    }
}

