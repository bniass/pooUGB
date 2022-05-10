package service;

public interface ICalcul {
    public default int somme(int a, int b){
      return a + b;
    }
    public default int soustarction(int a, int b){
        return a - b;
    }
    public int monOperation(int a, int b);
}
