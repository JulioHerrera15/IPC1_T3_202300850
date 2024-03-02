package tarea3;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    void display() {
        System.out.println("Cuadrado:");
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
   
    
   
    
}
