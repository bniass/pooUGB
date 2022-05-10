package service;

import main.Main2;
import model.Etudiant;
import model.Externe;
import model.Interne;

public class EtudiantService implements IEtudiant {
    @Override
    public void saisie(int type) {
        Etudiant et = null;
        if(type == 0){
            et = new Interne();
            System.out.println("Saisie d'un interne");
            et.saisie();
        }
        else{
            System.out.println("Saisie d'un externe");
            et = new Externe();
            et.saisie();
        }
        Main2.etudiants.add(et);
    }

    @Override
    public void displayAll() {
        for (Etudiant e:Main2.etudiants) {
            System.out.println(e);
        }
    }

    @Override
    public void displayInterns() {
        boolean exist = false;
        for (Etudiant e:Main2.etudiants) {
            if(e instanceof Interne){
                System.out.println(e);
                exist = true;
            }
        }
        if(!exist){
            System.out.println("Aucun interne trouvé !");
        }
    }

    @Override
    public void displayExterns() {
        boolean exist = false;
        for (Etudiant e:Main2.etudiants) {
            if(e instanceof Externe){
                System.out.println(e);
                exist = true;
            }
        }
        if(!exist){
            System.out.println("Aucun externe trouvé !");
        }
    }

    @Override
    public int getSumBourse() {
        int som = 0;
        for (Etudiant e:Main2.etudiants) {
            if(e instanceof Interne){
                som += ((Interne)e).getBourse();
            }
        }
        return som;
    }

    @Override
    public int getSumAide() {
        int som = 0;
        for (Etudiant e:Main2.etudiants) {
            if(e instanceof Externe){
                som += Externe.getAide();
            }
        }
        return som;
    }
}
