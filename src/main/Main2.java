package main;

import model.Etudiant;
import service.EtudiantService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static List<Etudiant> etudiants;
    public static void main(String[] args) {
        EtudiantService service = new EtudiantService();
        etudiants = new ArrayList<>();
        Random random = new Random();
        System.out.print("Saisir le nombre d'étudiant :");
        Scanner sc = new Scanner(System.in);
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
