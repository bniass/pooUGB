package main;

import model.Etudiant;
import model.Externe;
import service.EtudiantService;
import service.EtudiantServiceMap;

import java.util.*;

public class Main3 {
    public static Map<String, Etudiant> etudiantMap;
    public static void main(String[] args) {
        etudiantMap = new HashMap<>();
        EtudiantServiceMap service = new EtudiantServiceMap();

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le montant de l'aide pour les étudiants :");
        Externe.setAide(sc.nextInt());
        System.out.print("Saisir le nombre d'étudiant :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int choix = random.nextInt(2);
            //saisir un etudiant (interne ou externe)
            service.saisie(choix);
        }
        //afficher les etudiants
        System.out.println("Affichage des étudiants");
        service.displayAll();
        //afficher les internes
        System.out.println("Affichage des étudiants internes");
        service.displayInterns();
        //afficher les externes
        System.out.println("Affichage des étudiants externes");
        service.displayExterns();
        //afiiche la somme des bourses
        System.out.println("Somme des bouses = "+service.getSumBourse());
        //afficher la somme des aides
        System.out.println("Somme des aides = "+service.getSumAide());
    }
}
