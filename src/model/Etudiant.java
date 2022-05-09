package model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Etudiant{
    protected String matricule, nom, prenom, email;
    protected LocalDate dateNaissance;
    protected int age;

    public Etudiant(String matricule, String nom, String prenom,
                    String email, LocalDate dateNaissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        age = (int)ChronoUnit.YEARS.between(dateNaissance, LocalDate.now());

    }
    public Etudiant(String matricule) {
        this.matricule = matricule;
    }

    public Etudiant(){}

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
        age = (int)ChronoUnit.YEARS.between(dateNaissance, LocalDate.now());
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return matricule+" / "+nom+" / "+prenom+" / "+email+" / "+dateNaissance+" / "+age;
    }

    public void saisie(){
        Scanner sc = new Scanner(System.in);
        System.out.print("saisir le matricule : ");
        matricule = sc.nextLine();
        System.out.print("saisir le nom : ");
        nom = sc.nextLine();
        System.out.print("saisir le prenom : ");
        prenom = sc.nextLine();
        System.out.print("saisir l'email : ");
        email = sc.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("saisir la date de naissance : ");
        dateNaissance = LocalDate.parse(sc.nextLine(), df);
        age = (int)ChronoUnit.YEARS.between(dateNaissance, LocalDate.now());
    }

}


