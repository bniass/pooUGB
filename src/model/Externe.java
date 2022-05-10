package model;

import java.time.LocalDate;
import java.util.Scanner;

public class Externe extends Etudiant {
    private String adresse;
    private static int aide;

    public Externe(String matricule, String nom, String prenom, String email, LocalDate dateNaissance, String adresse) {
        super(matricule, nom, prenom, email, dateNaissance);
        this.adresse = adresse;
    }

    public Externe() {
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public static int getAide() {
        return aide;
    }

    public static void setAide(int aide) {
        Externe.aide = aide;
    }

    @Override
    public String toString() {
        return super.toString()+" / "+adresse+" / "+aide;
    }

    @Override
    public void saisie() {
        super.saisie();
        Scanner sc = new Scanner(System.in);
        System.out.print("saisir l'adresse de l'étudiant : ");
        adresse = sc.nextLine();
    }
}
