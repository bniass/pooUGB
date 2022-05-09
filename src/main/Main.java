package main;

import model.Etudiant;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Etudiant modou = new Etudiant();
        modou.setMatricule("0987");
        modou.setNom("Fall");
        modou.setPrenom("Modou");
        modou.setEmail("modou@gmail.com");
        modou.setDateNaissance(LocalDate.now());






    }
}
