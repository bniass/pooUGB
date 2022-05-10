package service;

public class CalculService1 implements ICalcul {
    @Override
    public int monOperation(int a, int b) {
        return 2 * a + 5 * b;
    }

    @Override
    public int somme(int a, int b) {
        return (a + b)/a;
    }
}
