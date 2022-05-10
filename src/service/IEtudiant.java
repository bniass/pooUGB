package service;

public interface IEtudiant {
    //saisir un etudiant (interne ou externe)
    public void saisie(int type);
    //afficher les etudiants
    public void displayAll();
    //afficher les internes
    public void displayInterns();
    //afficher les externes
    public void displayExterns();
    //afiiche la somme des bourses
    public int getSumBourse();
    //afficher la somme des aides
    public int getSumAide();
}
