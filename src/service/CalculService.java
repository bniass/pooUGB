package service;

public class CalculService implements ICalcul {
    @Override
    public int monOperation(int a, int b) {
        return a * b * 2;
    }

    public int operation(int a, int b){
        return a * a + 2 * b;
    }
}
