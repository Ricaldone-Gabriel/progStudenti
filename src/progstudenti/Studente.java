/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progstudenti;

import java.util.Scanner;

/**
 *Data la classe Studente (da migliorare)  realizzare un main che gestisca le seguenti richieste:
-memorizzare in un array di oggetti 4 Studenti (dati inseriti a piacere)
-aggiungere 3 voti per ogni studente
-visualizzi tutti i nomi degli studenti con le relative medie.
-visualizzare lo studente più bravo
-visualizzare il peggiore
-creare un metodo che permetta di azzerare tutti i voti dello studente
-chiesto un cognome azzerare tutti i suoi voti
 * @author gigga
 */
public class Studente {
    private String nome;
    private Scanner in = new Scanner(System.in);
    private int nVoti;
    private float vet[];
    Studente(String nome,int nVoti){
        this.nome=nome;
        vet=new float[nVoti];
        this.nVoti = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


    public float media(){
        float media=0;
        int i;

        for(i=0; i<nVoti; i++){
            media += vet[i];
        }
        return media/(nVoti);
    }

    public void assegnaVoto(){
        if (nVoti < vet.length) {
            System.out.print("Voto " + (nVoti+1) + ": ");
            do {
                vet[nVoti] = in.nextFloat(); 
            } while (vet[nVoti] < 0 || vet[nVoti] > 10);
            nVoti++;
        }
    }
    
    public void azzeraVoti() {
        nVoti = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = 0;
        }
    }
}
