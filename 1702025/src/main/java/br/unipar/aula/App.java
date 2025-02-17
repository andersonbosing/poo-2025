/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.aula;

/**
 *
 * @author andersonbosing
 */
public class App {

    public static void main(String[] args) {
        
        Gato a = new Gato();
        a.nome = "Frajola";
        a.cor = "Malhado";
        a.peso = 5.0;
        a.raca = "SRD";
        a.tamanho = "Médio";
        
        Gato b = new Gato();
        b.nome = "Claudio";
        b.cor = "Laranja";
        b.peso = 2.0;
        b.raca = "Persa";
        b.tamanho = "Pequeno";
        
        a.miar();
        b.miar();
        
        
    }
}
