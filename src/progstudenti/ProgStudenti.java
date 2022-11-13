/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progstudenti;

import java.util.Scanner;

/**
 *
 * @author gigga
 */
public class ProgStudenti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contVet = 4;
        float max = -1, min = 11;
        int pos = 0,i;
        String rispostaString;
        boolean trov = false;
        int rispostaInt;
        Scanner in = new Scanner(System.in);
        Studente vetStudenti[] = new Studente[contVet];
        
        for (i = 0; i < contVet; i++) {
            System.out.println("Come si chiama lo studente?");
            rispostaString = in.nextLine();
            
            System.out.println("Quanti voti ha?");
            rispostaInt = in.nextInt();
            in.nextLine();
            
            vetStudenti[i] = new Studente(rispostaString,rispostaInt);
       
            for (int j = 0; j < rispostaInt; j++) {
                vetStudenti[i].assegnaVoto();
            }
        }
        
        for (i = 0; i < contVet; i++) {
            if (vetStudenti[i].media() > max) {
                pos = i;
                max = vetStudenti[i].media();
            }
        }
        
        System.out.println("Lo studente: " + vetStudenti[pos] + " ha la media più alta: " + max);
        
        for (i = 0; i < contVet; i++) {
            if (vetStudenti[i].media() < min) {
                pos = i;
                min = vetStudenti[i].media();
            }
        }
        
        System.out.println("Lo studente: " + vetStudenti[pos] + " ha la media più bassa: " + min);
        
        for (i = 0; i < contVet; i++) {
            System.out.println("Studente: " + vetStudenti[i].getNome() + " | Media: " + vetStudenti[i].media());
        }
        
        System.out.println("Dammi un nome per azzerare i voti");
        rispostaString = in.nextLine();
        i = 0;
        do {
            if (rispostaString.equals(vetStudenti[i].getNome())) {
                vetStudenti[i].azzeraVoti();
                System.out.println("Voti azzerati, media attuale: " + vetStudenti[i].media());
                trov = true;
            }
            i++;
        } while (!trov && i < contVet);
        
    }
    
}
