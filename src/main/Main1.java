package main;

import model.Etudiant;
import model.Externe;
import model.Interne;

public class Main1 {
    public static void main(String[] args) {
        Etudiant[] tab = new Etudiant[4];
        System.out.println("Saisie de l'interne 1");
        Interne interne1 = new Interne();
        interne1.saisie();
        System.out.println("Saisie de l'interne 2");
        Interne interne2 = new Interne();
        interne2.saisie();
        tab[0] = interne1;
        tab[1] = interne2;

        Externe.setAide(60000);

        System.out.println("Saisie de l'externe 1");
        Externe externe1 = new Externe();
        externe1.saisie();
        System.out.println("Saisie de l'externe 2");
        Externe externe2 = new Externe();
        externe2.saisie();
        tab[2] = externe1;
        tab[3] = externe2;

        for (Etudiant e: tab) {
            if(e instanceof Interne)
            {
                System.out.print("Interne : ");
            }else{
                System.out.print("Externe : ");
            }
            System.out.println(e);
        }

    }
}
