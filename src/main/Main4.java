package main;

import service.CalculService;
import service.ICalcul;

public class Main4 {
    public static void main(String[] args) {
        ICalcul iCalcul = new CalculService();
        System.out.println(iCalcul.monOperation(10, 20));
        System.out.println(iCalcul.somme(30, 50));
        System.out.println(iCalcul.soustarction(10, 20));
        CalculService iCalcul1 = new CalculService();

        ICalcul calcul1 = new ICalcul() {
            @Override
            public int monOperation(int a, int b) {
                return a * b;
            }

            @Override
            public int somme(int a, int b) {
                System.out.println("Je suis la fonction somme mais je ne calcule pas la somme");
                return 0;
            }
        };
        System.out.println(calcul1.monOperation(10, 20));
        System.out.println(calcul1.somme(10, 20));
    }
}
