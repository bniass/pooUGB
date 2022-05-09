package model;

import java.time.LocalDate;
import java.util.Scanner;

public class Interne extends Etudiant {
    private String numBatiment, numChambre;
    private int bourse, typeBourse;

    public Interne(String matricule, String nom, String prenom, String email,
                   LocalDate dateNaissance, String numBatiment, String numChambre,
                   int bourse, int typeBourse) {
        super(matricule, nom, prenom, email, dateNaissance);
        this.numBatiment = numBatiment;
        this.numChambre = numChambre;
        this.bourse = bourse;
        this.typeBourse = typeBourse;
    }
    public Interne() {

    }

    public String getNumBatiment() {
        return numBatiment;
    }

    public void setNumBatiment(String numBatiment) {
        this.numBatiment = numBatiment;
    }

    public String getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(String numChambre) {
        this.numChambre = numChambre;
    }

    public int getBourse() {
        return bourse;
    }

    public void setBourse(int bourse) {
        this.bourse = bourse;
    }

    public int getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(int typeBourse) {
        this.typeBourse = typeBourse;
    }

    @Override
    public String toString() {
        return super.toString()+" / "+numBatiment+" / "+numChambre+" / "+typeBourse+" / "+bourse;
    }

    @Override
    public void saisie() {
        super.saisie();
        Scanner sc = new Scanner(System.in);
        System.out.print("saisir le numéro de batiment : ");
        numBatiment = sc.nextLine();
        System.out.print("saisir le numero de chambre : ");
        numChambre = sc.nextLine();

        do {
            System.out.print("saisir 0 pour demi bourse ou 1 pour bourse entiere : ");
            typeBourse = sc.nextInt();
        }while (typeBourse != 0 && typeBourse != 1);
        bourse = (typeBourse==0?20000:40000);
    }
}
